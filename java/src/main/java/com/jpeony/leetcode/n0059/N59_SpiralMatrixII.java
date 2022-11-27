package com.jpeony.leetcode.n0059;

/**
 * [59. 螺旋矩阵 II](https://leetcode.cn/problems/spiral-matrix-ii/)
 *
 * @author yihonglei
 */
public class N59_SpiralMatrixII {

    public static int[][] generateMatrix(int n) {
        int loop = 0;
        int[][] res = new int[n][n];

        int start = 0; // 每次循环的开始点(start,start)
        int count = 1; // 定义填充数字

        int x, y; // 数字在螺旋矩阵中的坐标位置(x,y)

        while (loop++ < n / 2) {
            // 上行从左到右(左闭右开)
            for (y = start; y < n - loop; y++) {
                res[start][y] = count++;
            }

            // 右列从上到下(左闭右开)
            for (x = start; x < n - loop; x++) {
                res[x][y] = count++;
            }

            // 下行从右到左(左闭右开)
            for (; y >= loop; y--) {
                res[x][y] = count++;
            }

            // 左列左侧从下到上(左闭右开)
            for (; x >= loop; x--) {
                res[x][y] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }


        return res;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
