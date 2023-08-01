package com.jpeony.leetcode.n0977;

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
        int left = 0; // 指向数组开始位置
        int right = nums.length - 1; // 指向数组末尾位置

        // 新数组，存储平方后的元素
        int[] res = new int[nums.length];
        // 新数组下标，初始指向数组末尾
        int index = nums.length - 1;
        while (left <= right) {
            // 求平方（求平方别用Math.pow(x,2)函数，卡）
            int leftPow = nums[left] * nums[left];
            int rightPow = nums[right] * nums[right];
            if (rightPow >= leftPow) { // 右指针向左移动，去比较下一次平方的最大值
                res[index] = rightPow;
                right--;
            } else {// 左指针向右移动，去比较下一次平方的最大值
                res[index] = leftPow;
                left++;
            }
            index--;
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
