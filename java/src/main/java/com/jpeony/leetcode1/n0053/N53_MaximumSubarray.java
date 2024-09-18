package com.jpeony.leetcode1.n0053;

/**
 * [53. 最大子数组和](https://leetcode.cn/problems/maximum-subarray)
 */
public class N53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = Integer.MIN_VALUE;
        int count = 0; // 统计每个连续区间的和
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            sum = Math.max(sum, count);
            if (count <= 0) {
                count = 0; // 重新开始统计连续区间的和，负数只会拉低整体的和
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSubArray(nums);
        System.out.println("i = " + i);
    }
}
