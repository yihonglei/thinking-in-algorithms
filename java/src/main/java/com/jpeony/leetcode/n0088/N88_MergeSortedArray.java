package com.jpeony.leetcode.n0088;

import java.util.Arrays;

/**
 * [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
 * [88. 合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/)
 *
 * @author yihonglei
 */
public class N88_MergeSortedArray {

    /**
     * 【合并+排序】
     * 时间复杂度：O((m+n)log(m+n))。合并数组长度为 m + n，快排时间复杂度为 O((m+n)log(m+n))。
     * 空间复杂度：O(log(m+n))。合并数组长度为 m + n，快排空间复杂度为 O(log(m+n))。
     */
    private static void mergeOne(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    /**
     * 【双指针】
     * 时间复杂度：O(m + n)。指针移动总次数，两个数组长度的和 m + n，所以时间复杂度为 O(m+n)。
     * 空间复杂度：O(m + n)。新建立 m + n 长度数组，存储排序后的元素，所以空间复杂度为 O(m+n)。
     */
    private static void mergeTwo(int[] nums1, int m, int[] nums2, int n) {

    }

    /**
     * 【逆向双指针】
     * 时间复杂度：O(m + n)。指针移动总次数，两个数组长度的和 m + n，所以时间复杂度为 O(m+n)。
     * 空间复杂度：O(1)。原地操作数组，不需要额外新增空间，所以空间复杂度为 O(1)。
     */
    private static void mergeThree(int[] nums1, int m, int[] nums2, int n) {

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeOne(nums1, 3, nums2, 3);
        System.out.println("mergeSortedArray = " + Arrays.toString(nums1));
    }
}
