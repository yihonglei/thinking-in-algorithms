package com.jpeony.base.sorts;

import java.util.Arrays;

/**
 * 【插入排序】
 * 将数组分为已排序区间和未排序区间，初始已排序区间只有数组中的第一个元素。
 * 取未排序区间中的元素，即从未排序区间第一个元素依次取（数组中的第二个元素），
 * 在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。
 * 重复这个过程，直到未排序区间中元素为空，算法结束。
 *
 * @author yihonglei
 */
public class InsertSort {
    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    private static void insertSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            // 未排序区间的第一个元素
            int value = arr[i];
            // j 为已排序区间最后一个元素的下标值
            int j = i - 1;
            // 将未排序区间的第一个元素在已排序区间找到合适的位置插入
            for (; j >= 0; --j) {
                // 比较和移动
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            // 插入（加1，弥补 --j 减掉的 1，还原元素的真实位置）
            arr[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        insertSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
