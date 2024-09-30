package com.jpeony.leetcode1.n0062;

/**
 * [62. 不同路径](https://leetcode.cn/problems/unique-paths)
 */
public class N62_UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3, n = 7;
        int i = uniquePaths(m, n);
        System.out.println("i = " + i);
    }
}
