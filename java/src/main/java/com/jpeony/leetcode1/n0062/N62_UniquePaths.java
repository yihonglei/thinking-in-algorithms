package com.jpeony.leetcode1.n0062;

/**
 * [62. 不同路径](https://leetcode.cn/problems/unique-paths)
 */
public class N62_UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n]; // 1、dp[i][j]：机器人走到 dp[i][j] 位置的路径数量

        // 3、初始化dp数组：上边界和左边界初始为0，因为机器人只能向右或向下移动一步，需要基于边界值推导下一步路径
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        // 4、确定遍历顺序：基于初始边界，依赖左边和上边的值，需要从前向后遍历
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // 2、递推公式：由前面两个位置路径数，推导出当前位置路径数
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
