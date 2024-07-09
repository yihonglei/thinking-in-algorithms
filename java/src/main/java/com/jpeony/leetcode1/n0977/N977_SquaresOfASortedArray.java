package com.jpeony.leetcode1.n0977;

import java.util.Arrays;

/**
 * [977. 有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/)
 *
 * @author yihonglei
 */
public class N977_SquaresOfASortedArray {

    /**
     * 方法1、【直接排序】
     * 时间复杂度：O(nlogn)，不满足优化要求 O(n)。
     * 空间复杂度：O(1)，可以在原数组上操作，不需要额外空间。
     */
    private static int[] sortedSquaresOne(int[] nums) {
        // 计算平方数组
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // 快排 O(nlogn)
        Arrays.sort(nums);

        return nums;
    }

    /**
     * 方法2、【双指针】
     * 时间复杂度：O(n)。n 为数组的长度，循环了 n 次，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。除了存储数组的空间，额外的只有临时变量空间，所以渐进空间复杂度为 O(1)。
     */
    private static int[] sortedSquaresTwo(int[] nums) {
        int left = 0; // 指向数组的头部
        int right = nums.length - 1; // 指向数组的尾部

        // 返回值
        int[] res = new int[nums.length];
        int index = res.length - 1; // 指向返回数组的尾部
        // 算平方根，并排序【平方根最大值出现在数组的两端】
        while (left <= right) {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];
            if (rightSqr >= leftSqr) {
                res[index--] = rightSqr;
                right--;
            } else {
                res[index--] = leftSqr;
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println("sortedSquares Before = " + Arrays.toString(nums));
        // 方法1、【直接排序】
        // int[] ans = sortedSquaresOne(nums);

        // 方法2、【双指针】
        int[] ans = sortedSquaresTwo(nums);
        System.out.println("sortedSquares After = " + Arrays.toString(ans));
    }
}
