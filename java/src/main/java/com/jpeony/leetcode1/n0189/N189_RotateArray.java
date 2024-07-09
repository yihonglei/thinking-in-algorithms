package com.jpeony.leetcode1.n0189;

/**
 * [189. 轮转数组](https://leetcode.cn/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150)
 *
 * @author yihonglei
 */
public class N189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }

        System.arraycopy(newArr, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        rotate(nums, 3);

        for (int i : nums) {
            System.out.print(i);
        }
    }
}
