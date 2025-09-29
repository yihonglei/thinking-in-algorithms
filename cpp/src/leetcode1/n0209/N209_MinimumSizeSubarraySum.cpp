#include "vector"
#include "N209_MinimumSizeSubarraySum.hpp"

/**
 * [209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum)
 */
int N209_MinimumSizeSubarraySum::minSubArrayLen(int target, std::vector<int> &nums) {
    int result = INT32_MAX;
    int sum = 0;
    int left = 0;
    int subLen = 0;
    for (int right = 0; right < nums.size(); right++) {
        sum += nums[right];
        while (sum >= target) {
            subLen = right - left + 1;
            result = result < subLen ? result : subLen;
            sum -= nums[left--];
        }
    }

    return result == INT32_MAX ? 0 : result;
}