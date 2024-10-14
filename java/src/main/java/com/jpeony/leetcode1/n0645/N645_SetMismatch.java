package com.jpeony.leetcode1.n0645;

import java.util.Arrays;

/**
 * [645. 错误的集合](https://leetcode.cn/problems/set-mismatch)
 */
public class N645_SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] ans = new int[2];
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            if (cur == prev) {
                ans[0] = prev;
            } else if (cur - prev > 1) {
                ans[1] = prev + 1;
            }
            prev = cur;
        }

        if (nums[n - 1] != n) {
            ans[1] = n;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        int[] errorNums = findErrorNums(nums);
        System.out.println("errorNums = " + Arrays.toString(errorNums));
    }
}
