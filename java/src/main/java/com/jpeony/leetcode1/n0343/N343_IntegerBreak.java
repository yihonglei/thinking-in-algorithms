package com.jpeony.leetcode1.n0343;

/**
 * [343. 整数拆分](https://leetcode.cn/problems/integer-break)
 */
public class N343_IntegerBreak {
    /**
     * 动态规划
     */
    // 拆成 m 个近似相同的数
    public static int integerBreak(int n) {
        // dp[i] 分拆数字 i，可以得到的最大乘积为 dp[i]
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i - j; j++) {
                /*
                 * j * (i - j) 是单纯的把整数 i 拆分为两个数 也就是 i,i-j ，再相乘；
                 * 而j * dp[i - j]是将 i 拆分成两个以及两个以上的个数,再相乘;
                 */
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 2;
        int i = integerBreak(n);
        System.out.println("i = " + i);
    }
}
