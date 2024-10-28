package com.jpeony.leetcode1.n0485;

/**
 * [485. 最大连续 1 的个数](https://leetcode.cn/problems/max-consecutive-ones)
 */
public class N485_MaxConsecutiveOnes {
    /**
     * 双指针-滑动窗口
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int count = 0;
        int left = 0;
        int right = 0;
        while (right < length) {
            if (nums[right++] == 0) {
                count = Math.max(count, right - left - 1);
                left = right;
            }
        }
        // 因为最后一次连续序列在循环中无法比较，所以在循环外进行比较
        return Math.max(count, right - left);
    }

    public static void main(String[] args) {
        // int[] nums = {1, 0, 1, 1, 0, 1};
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxCount = findMaxConsecutiveOnes(nums);
        System.out.println(maxCount);
    }
}
