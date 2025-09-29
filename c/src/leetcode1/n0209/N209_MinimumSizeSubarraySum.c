//
// Created by yihonglei on 2025/9/29.
//
#include <inttypes.h>
#include "N209_MinimumSizeSubarraySum.h"


int minSubArrayLen(int target, int *nums, int numsSize) {
    int result = INT32_MAX;
    int sum = 0;
    int left = 0;
    int subLen = 0;
    for (int right = 0; right < numsSize; right++) {
        sum += nums[right];
        while (sum >= target) {
            subLen = right - left + 1;
            result = result < subLen ? result : subLen;
            sum -= nums[left++];
        }
    }

    return result == INT32_MAX ? 0 : result;
}