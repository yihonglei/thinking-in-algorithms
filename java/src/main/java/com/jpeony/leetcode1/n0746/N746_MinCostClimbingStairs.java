package com.jpeony.leetcode1.n0746;

/**
 * [746. 使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs)
 */
public class N746_MinCostClimbingStairs {
    /**
     * 算法：动态规划
     * 时间复杂度：O(n)。n 为楼梯阶数。
     * 空间复杂：O(n)。n 为楼梯阶数。
     */
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        // 确定dp数组以及下标的含义：第i阶最小的花费为dp[i]
        int[] dp = new int[len + 1];
        // 初始化dp数组
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= len; i++) {// 确定遍历顺序：从前到后
            // 确定递推公式：dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[len];
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int i = minCostClimbingStairs(cost);
        System.out.println("i = " + i);
    }
}
