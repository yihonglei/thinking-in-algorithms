//
// Created by yihonglei on 2025/6/26.
//
#include "N704_BinarySearch.h"

int search(int *nums, int numsSize, int target) {
    int left = 0;
    int right = numsSize - 1;
    int middle = 0;
    while (left <= right) {
        middle = left + (right - left) / 2;
        if (nums[middle] < target) {
            left = middle + 1;
        } else if (nums[middle] > target) {
            right = middle - 1;
        } else {
            return middle;
        }
    }
    return -1;
}