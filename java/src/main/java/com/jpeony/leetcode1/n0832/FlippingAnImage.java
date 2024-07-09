package com.jpeony.leetcode1.n0832;

import java.util.Arrays;

/**
 * [832. 翻转图像](https://leetcode.cn/problems/flipping-an-image/description/)
 */
public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length; // 一维度数组长度
        int[][] res = new int[n][image[0].length]; // 收集计算结果
        for (int i = 0; i < n; i++) {
            int[] child = image[i]; // 二维数组
            int len = child.length;
            for (int j = len - 1; j >= 0; j--) {
                // 倒序遍历翻转
                int value = child[j];
                // 反转操作
                value ^= 1;
                // 翻转并反转后赋值
                res[i][len - j - 1] = value;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] res = flipAndInvertImage(image);
        for (int[] a : res) {
            System.out.println(Arrays.toString(a));
        }
    }
}
