#include "N27_RemoveElement.h"

/**
 * [27. 移除元素](https://leetcode.cn/problems/remove-element/)
 */
int removeElement(int *nums, int numsSize, int val) {
    int slow = 0;
    for (int fast = 0; fast < numsSize; fast++) {
        if (nums[fast] != val) {
            nums[slow++] = nums[fast];
        }
    }

    return slow;
}