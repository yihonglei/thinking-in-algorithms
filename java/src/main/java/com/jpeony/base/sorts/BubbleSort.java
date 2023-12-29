package com.jpeony.base.sorts;

import java.util.Arrays;

/**
 * 【冒泡排序】
 * 每次冒泡都会遍历整个数组，依次对数组中相邻的元素进行比较，看是否满足大小关系要求，
 * 如果不满足，就将它们互换。
 * 每次冒泡操作会让至少一个元素移动到它应该在的位置，重复 n 次，就完成了 n 个数据的排序工作。
 *
 * @author yihonglei
 */
public class BubbleSort {
    /**
     * 时间复杂度：O(n^2)，最好情况时间复杂度为 O(n)
     * 空间复杂度：O(1)
     * 稳定性：稳定排序算法
     */
    private static void bubbleSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false; // 提前退出冒泡循环的标志位
            // 每一轮比较出一个最大值固定，已经冒到上层的元素，无需再继续比较，因为已经符合既定要求
            for (int j = 0; j < n - i - 1; j++) {
                // 比较&交换
                if (arr[j] > arr[j + 1]) { // 不符合大小关系要求，交换相邻的两个元素
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true; // 表示有数据交换
                }
            }
            if (!flag) { // 没有数据交换，提前退出
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
