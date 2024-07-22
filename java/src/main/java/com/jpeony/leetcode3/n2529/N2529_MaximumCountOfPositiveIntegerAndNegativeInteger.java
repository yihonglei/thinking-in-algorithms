package com.jpeony.leetcode3.n2529;

/**
 * [2529. 正整数和负整数的最大计数](https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/description/)
 */
public class N2529_MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums) {
        int target = 0;
        int len = nums.length;

        int negative = 0;
        int positive = 0;

        // 1、查找最后一个小于目标值下标位置(针对负整数系列)
        int mid = 0;
        int low = 0;
        int high = len - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                negative = -1;
                high = mid - 1;
            } else if (nums[mid] < target) {
                if (mid == (len - 1) || nums[mid + 1] >= target) {
                    negative = mid;
                    break;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }

        // 2、查找第一个大于目标值下标位置(针对正整数系列)
        mid = 0;
        low = 0;
        high = len - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                positive = len;
                low = mid + 1;
            } else if (nums[mid] > target) {
                if (mid == 0 || nums[mid - 1] <= target) {
                    positive = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }

        return Math.max(negative + 1, (len - 1) - positive + 1); // 为了通过下标计算长度好理解，没写为 len-positive
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        int res = maximumCount(nums);
        System.out.println("res = " + res);
    }
}
