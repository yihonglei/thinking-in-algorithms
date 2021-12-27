package com.jpeony.leetcode.n0079;

/**
 * [79. Word Search](https://leetcode.com/problems/word-search/)
 * [79. 单词搜索](https://leetcode-cn.com/problems/word-search/)
 *
 * @author yihonglei
 */
public class N79_WordSearch {
    /* 方向数组 */
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    /* 网格宽 */
    private int m;
    /* 网格高 */
    private int n;
    /* 网格 */
    private char[][] board;
    /* 已搜索过的网格单元记录 */
    private boolean[][] visited;
    /* 单词长度 */
    private int len;
    /* 单词数组 */
    private char[] charArray;

    /**
     * 【DFS + 回溯】
     * 时间复杂度：O(m * n)。可以简单的判断，m 为网格的宽，n 为网格的高，两层循环嵌套，所以时间复杂度为 O(m * n)；
     * 空间复杂度：O(n)。渐进增长空间为存储遍历过的数组标记 visited，n 为 二维数组元素个数，所以空间复杂度为 O(n)；
     */
    public boolean exist(char[][] board, String word) {
        this.board = board;
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];

        this.len = word.length();
        this.charArray = word.toCharArray();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 深度优先搜索
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int x, int y, int begin) {
        System.out.println("x = " + x + ", y = " + y + ", e = " + board[x][y]);
        // 当完成一轮搜索，退出进行下一轮循环
        if (begin == len - 1) {
            return board[x][y] == charArray[begin];
        }
        // 如果网格当前的位置字母与单词数组中位置元素匹配，才具备继续往下搜索下一个字母的意义
        if (board[x][y] == charArray[begin]) {
            // 已经搜索过的，比较为 true
            visited[x][y] = true;
            // 从当前元素值的相邻四个方向进行搜索下一个字母是否匹配
            for (int[] direction : DIRECTIONS) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                // 在网格内未搜索过的，继续进行深度搜索
                if (inArea(newX, newY) && !visited[newX][newY]) {
                    if (dfs(newX, newY, begin + 1)) {
                        return true;
                    }
                }
            }
            // 如果未找到元素，重置状态为 false，回溯到之前的路径深度搜索
            visited[x][y] = false;
        }
        return false;
    }

    /**
     * 搜索必须在网格内进行，否则无效
     */
    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";

        N79_WordSearch ws = new N79_WordSearch();
        boolean exist = ws.exist(board, word);
        System.out.println("exist = " + exist);
    }
}
