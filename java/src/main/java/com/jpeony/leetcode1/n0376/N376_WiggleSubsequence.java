package com.jpeony.leetcode1.n0376;

/**
 * [376. 摆动序列](https://leetcode.cn/problems/wiggle-subsequence/)
 */
public class N376_WiggleSubsequence {
    public static int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int up = 1; // 波峰
        int down = 1; // 波谷

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            }

            if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }

        return Math.max(up, down);
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 4, 9, 2, 5};
        int len = wiggleMaxLength(nums);
        System.out.println("len = " + len);
    }
}
