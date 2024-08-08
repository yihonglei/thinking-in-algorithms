package com.jpeony.leetcode4;

/**
 * [找出与数组相加的整数 I](https://leetcode.cn/problems/find-the-integer-added-to-array-i)
 */
public class N3131_FindTheIntegerAddedToArray1 {
    public static int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length;
        if (n == 0) {
            return 0;
        }
        return min(nums2) - min(nums1);
    }

    public static int min(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        for (int x : nums) {
            minValue = Math.min(minValue, x);
        }

        return minValue;
    }

    public static void main(String[] args) {

    }
}
