package com.jpeony.base.sorts;

import java.util.Arrays;

/**
 * 归并排序
 * 重点理解分治算法思想和递归处理思路。
 * 分治是一种思想，递归是一种技巧。
 * <p>
 * 分治是把大问题分解为小问题去解决，小问题都解决了，大问题也就解决了。
 *
 * @author yihonglei
 */
public class MergeSort {
    // 归并排序算法，a 是数组，n 表示数组大小
    public static void mergeSort(int[] a, int n) {
        mergeSortInternally(a, 0, n - 1);
    }

    // 递归调用函数
    private static void mergeSortInternally(int[] a, int p, int r) {
        // 递归终止条件
        if (p >= r) return;

        // 取 p 到 r 之间的中间位置 q，防止（p+r）的和超过 int 类型最大值
        int q = p + (r - p) / 2;
        // 分治递归
        mergeSortInternally(a, p, q);
        mergeSortInternally(a, q + 1, r);

        // 将 A[p...q] 和 A[q+1...r] 合并为 A[p...r]
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0; // 初始化变量i，j，k
        int[] tmp = new int[r - p + 1]; // 申请一个大小跟 a[p...r] 一样的临时数组
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++]; // i++ 等于 i = i+1
            } else {
                tmp[k++] = a[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = a[start++];
        }

        // 将 tmp 中的数组拷贝回 a[p...r]
        for (i = 0; i <= r - p; ++i) {
            a[p + i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1};
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
