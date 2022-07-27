package com.jpeony.leetcode.n0977;

import java.util.Arrays;

/**
 * [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
 * [977. 有序数组的平方](https://leetcode.cn.com/problems/squares-of-a-sorted-array/)
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
        int leftPoint = 0, rightPoint = nums.length - 1;
        int[] ans = new int[nums.length];
        int index = nums.length - 1;
        while (leftPoint <= rightPoint) {
            int leftSq = nums[leftPoint] * nums[leftPoint];
            int rightSq = nums[rightPoint] * nums[rightPoint];
            if (leftSq < rightSq) {
                ans[index--] = rightSq;
                rightPoint--;
            } else {
                ans[index--] = leftSq;
                leftPoint++;
            }
        }

        return ans;
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
