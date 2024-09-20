package com.jpeony.leetcode2.n1005;

import java.util.Arrays;

/**
 * [1005.K次取反后最大化的数组和](https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations)
 */
public class N1005_MaximizeSumOfArrayAfterKNegations {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        // 先处理负数
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            } else {
                break;
            }
        }
        // 如果k还剩余，需要操作完
        Arrays.sort(nums);
        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }
        // 操作k次后求和
        int sum = 0;
        for (int e : nums) {
            sum += e;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, 0, 2, -2};
        int k = 3;
        int sum = largestSumAfterKNegations(nums, k);
        System.out.println(sum);
    }
}
