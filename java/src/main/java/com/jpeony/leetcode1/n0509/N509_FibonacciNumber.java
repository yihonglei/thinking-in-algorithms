package com.jpeony.leetcode1.n0509;

import java.util.Arrays;

/**
 * [509. 斐波那契数](https://leetcode.cn/problems/fibonacci-number)
 */
public class N509_FibonacciNumber {
    /**
     * 动态规划：
     * 时间复杂度：O(n)，n 为 数字大小；
     * 空间复杂度：O(1)，固定空间；
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1]; // 1、dp[i]：表示第 i 个数对应的斐波那契数
        dp[0] = 0; // 3、初始化 dp 数组
        dp[1] = 1;
        for (int i = 2; i <= n; i++) { // 4、从前到后遍历
            dp[i] = dp[i - 1] + dp[i - 2]; // 2、递推公式
            System.out.println("i = " + i + ", dp = " + Arrays.toString(dp)); // 5、打印 dp 数组
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int fib = fib(4);
        System.out.println("fib = " + fib);
    }
}
