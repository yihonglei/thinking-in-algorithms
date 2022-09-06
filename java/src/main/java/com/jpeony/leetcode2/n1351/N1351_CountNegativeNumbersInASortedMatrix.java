package com.jpeony.leetcode2.n1351;

/**
 * [1351. Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
 * [1351. 统计有序矩阵中的负数](https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/)
 *
 * @author yihonglei
 */
public class N1351_CountNegativeNumbersInASortedMatrix {

    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] arr : grid) {
            int n = arr.length;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] < 0) {
                    // 全部小于0
                    if (mid == 0) {
                        ans += n;
                        break;
                    }
                    // 部分小于0，查找第一个小于0的位置
                    if (arr[mid - 1] >= 0) {
                        ans += n - mid;
                        break;
                    } else { // 继续往前寻找第一个小于0的位置
                        high = mid - 1;
                    }
                } else {// 往后寻找，小于0的位置
                    low = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int res = countNegatives(grid);
        System.out.println("res = " + res);
    }
}
