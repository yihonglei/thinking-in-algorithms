package com.jpeony.leetcode3.n2778;

/**
 * [2778. 特殊元素平方和](https://leetcode.cn/problems/sum-of-squares-of-special-elements)
 */
public class N2778_SumOfSquaresOfSpecialElements {
    /**
     * 时间复杂度：O(n)。n 为数组的长度。
     * 空间复杂度：O(1)。
     */
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 19, 18, 3};
        System.out.println(sumOfSquares(nums));
    }
}
