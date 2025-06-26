#include "N704_BinarySearch.hpp"

int N704_BinarySearch::search(std::vector<int> &nums, int target) {
    int left = 0;
    int right = nums.size() - 1;
    int middle = 0;
    while (left <= right) {
        middle = left + (right - left) / 2;
        if (nums[middle] > target) {
            right = middle - 1;
        } else if (nums[middle] < target) {
            left = middle + 1;
        } else {
            return middle;
        }
    }

    return -1;
}