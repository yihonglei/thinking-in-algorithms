package com.jpeony.leetcode1.n0494;

/**
 * [494.目标和](https://leetcode.cn/problems/target-sum)
 */
public class N494_TargetSum {
    // 动态规划
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        if (Math.abs(target) > sum) {
            return 0;
        }
        if ((target + sum) % 2 == 1) {
            return 0;
        }

        int bagSize = (target + sum) / 2;
        int[] dp = new int[bagSize + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] = dp[j] + dp[j - nums[i]];
            }
        }

        return dp[bagSize];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int targetSumWays = findTargetSumWays(nums, target);
        System.out.println("targetSumWays = " + targetSumWays);
    }
}
