package com.jpeony.interview;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 *
 * @author yihonglei
 */
public class Offer29 {
    /**
     * 模拟法，注意边界退出的判断条件
     */
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];

        while (true) {
            // left to right
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            if (++t > b) {
                break;
            }
            // top to bottom
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if (l > --r) {
                break;
            }
            // right to left
            for (int i = r; i >= l; i--) {
                res[x++] = matrix[b][i];
            }
            if (t > --b) {
                break;
            }
            // bottom to top
            for (int i = b; i >= t; i--) {
                res[x++] = matrix[i][l];
            }
            if (++l > r) {
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }
}
