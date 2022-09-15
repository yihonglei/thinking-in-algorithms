package com.jpeony.leetcode2.n1852;

/**
 * [852. Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
 * [852. 山脉数组的峰顶索引](https://leetcode.cn/problems/peak-index-in-a-mountain-array/)
 *
 * @author yihonglei
 */
public class N852_PeakIndexInAMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
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
        int res = peakIndexInMountainArray(arr);
        System.out.println("res = " + res);
    }
}
