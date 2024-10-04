package com.jpeony.leetcode1.n0416;

/**
 * [416. 分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum)
 */
public class N416_PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {// 如果和是奇数，不可能拆分为两个和相等的子集
            return false;
        }
        // 寻找和为 target 的子集
        int target = sum / 2;
        // 动态规划
        int[] dp = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                // 物品 i 的重量是 nums[i]，其价值也是 nums[i]
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }

        return dp[target] == target;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean b = canPartition(nums);
        System.out.println("b = " + b);
    }
}
