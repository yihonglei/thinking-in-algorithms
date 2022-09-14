package com.jpeony.interview;

/**
 * [剑指 Offer II 069. 山峰数组的顶部](https://leetcode.cn/problems/B1IidL/)
 *
 * @author yihonglei
 */
public class B1IidL {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] >= arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("ans = " + ans);
    }
}
