package com.jpeony.base.binarysearch;

/**
 * 【二分查找-变体1】：查找第一个值等于给定值的元素
 *
 * @author yihonglei
 */
public class SearchFirstEqualsTarget {
    private static int search(int[] arr, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] < value) {
                    return mid;
                } else { // 逐步往左逼近第一个等于给定值的元素
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        int index = search(arr, arr.length, target);
        System.out.println("index = " + index);
    }
}
