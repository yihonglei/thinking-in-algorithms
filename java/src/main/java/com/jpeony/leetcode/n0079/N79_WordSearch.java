package com.jpeony.leetcode.n0079;

/**
 * [79. Word Search](https://leetcode.com/problems/word-search/)
 * [79. 单词搜索](https://leetcode-cn.com/problems/word-search/)
 *
 * @author yihonglei
 */
public class N79_WordSearch {

    private static boolean exist(char[][] board, String word) {

        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean exist = exist(board, word);
        System.out.println("exist = " + exist);
    }
}
