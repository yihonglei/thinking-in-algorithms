package com.jpeony.leetcode1.n0070;

import java.util.Arrays;

/**
 * [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs)
 */
public class N70_ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1]; // 【第一步】确定 dp 数组以及下标的含义：dp[i]，第 i 级台阶对应的爬楼梯方法数
        dp[1] = 1; // 【第三步】初始化dp数组
        dp[2] = 2;
        for (int i = 3; i <= n; i++) { // 【第四步】确定遍历顺序：从前到后遍历
            dp[i] = dp[i - 1] + dp[i - 2]; // 【第二步】确定递推公式：dp[i] = dp[i - 1] + dp[i - 2]
            System.out.println("i = " + i + ", dp = " + Arrays.toString(dp)); // 【第五步】打印 dp 数组
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        int cs = climbStairs(n);
        System.out.println("cs = " + cs);
    }
}
