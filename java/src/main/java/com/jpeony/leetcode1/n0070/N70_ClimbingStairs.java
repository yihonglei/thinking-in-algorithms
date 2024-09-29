package com.jpeony.leetcode1.n0070;

/**
 * [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs)
 */
public class N70_ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1]; // 第 i 级台阶对应的爬楼梯方法数
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        int cs = climbStairs(n);
        System.out.println("cs = " + cs);
    }
}
