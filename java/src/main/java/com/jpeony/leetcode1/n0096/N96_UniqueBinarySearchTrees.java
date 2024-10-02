package com.jpeony.leetcode1.n0096;

/**
 * [96. 不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/)
 */
public class N96_UniqueBinarySearchTrees {
    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int i = numTrees(5);
        System.out.println("i = " + i);
    }
}
