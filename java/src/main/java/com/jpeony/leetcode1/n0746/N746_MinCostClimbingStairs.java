package com.jpeony.leetcode1.n0746;

/**
 * [746. 使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs)
 */
public class N746_MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1]; // 第i阶最小的花费
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= len; i++) {
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
