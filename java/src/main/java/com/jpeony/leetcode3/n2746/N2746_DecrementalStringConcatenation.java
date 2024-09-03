package com.jpeony.leetcode3.n2746;

import java.util.Arrays;

/**
 * [2746. 字符串连接删减字母](https://leetcode.cn/problems/decremental-string-concatenation)
 */
public class N2746_DecrementalStringConcatenation {
    public static int minimizeConcatenatedLength(String[] words) {
        // 计算最大长度
        int max = 0;
        for (String word : words) {
            max += word.length();
        }

        // 填充默认值为 最大长度
        int[][][] dp = new int[words.length][26][26];
        for (int[][] ints : dp) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, max);
            }
        }
        String first = words[0];
        // 初始化第一个字符串
        dp[0][first.charAt(0) - 'a'][first.charAt(first.length() - 1) - 'a'] = first.length();

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            int h = word.charAt(0) - 'a';
            int t = word.charAt(len - 1) - 'a';

            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    // 正
                    dp[i][j][t] = Math.min(dp[i][j][t], dp[i - 1][j][k] + (h == k ? len - 1 : len));

                    // 倒
                    dp[i][h][k] = Math.min(dp[i][h][k], dp[i - 1][j][k] + (t == j ? len - 1 : len));
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                min = Math.min(min, dp[words.length - 1][i][j]);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        String[] words = {"aaa", "c", "aba"};
        int min = minimizeConcatenatedLength(words);
        System.out.println("min = " + min);
    }
}
