package com.jpeony.interview;

/**
 * [剑指 Offer 04. 二维数组中的查找](https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)
 *
 * @author yihonglei
 */
public class Offer04 {

    /**
     * 暴力求解
     * 时间复杂度：O(m*n)。
     * 空间复杂度：O(1)。
     */
    public static boolean findNumberIn2DArrayForce(int[][] matrix, int target) {
        for (int[] anArr : matrix) {
            for (int v : anArr) {
                if (v == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 线性查找
     * 时间复杂度：O(m+n)。
     * 空间复杂度：O(1)。
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean numberIn2DArray = findNumberIn2DArray(matrix, target);
        System.out.println("findNumberIn2DArray = " + numberIn2DArray);
    }
}
