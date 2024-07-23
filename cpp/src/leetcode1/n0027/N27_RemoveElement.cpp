/**
 * [27. 移除元素](https://leetcode.cn/problems/remove-element/)
 */

#include <vector>
#include "N27_RemoveElement.hpp"

int N27_RemoveElement::removeElement(std::vector<int> &nums, int val) {
    int slow = 0;
    for (int fast = 0; fast < nums.size(); fast++) {
        if (nums[fast] != val) {
            nums[slow++] = nums[fast];
        }
    }

    return slow;
}