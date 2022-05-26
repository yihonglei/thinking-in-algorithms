package com.jpeony.base.sorts;

import java.util.Arrays;

/**
 * 【选择排序】
 * 跟插入排序非常类似，分为已排序区间和未排序区间，区别在于插入排序是从未排序
 * 区间取元素在已排序区间选择合适位置插入，而选择排序则是在未排序区间选择最小的元素
 * 放到已排序区间末尾。
 *
 * @author yihonglei
 */
public class SelectSort {
    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    private static void selectSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            // 查找未排序区间最小值下标
            int minPos = i;
            int j = i;
            for (; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // 坐标相同，无需交换，否则，需要进行交换，将未排序区间最小值交换插入到已排序区间尾端
            if (i != minPos) {
                int tmp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        selectSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
