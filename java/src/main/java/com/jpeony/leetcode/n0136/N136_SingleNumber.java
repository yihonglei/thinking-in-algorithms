package com.jpeony.leetcode.n0136;

/**
 * [136. 只出现一次的数字](https://leetcode.cn/problems/single-number/description/)
 */
public class N136_SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                res = res ^ nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 3, 3};
        int res = singleNumber(nums);
        System.out.println("singleNumber = " + res);

        // test
        System.out.println(2 ^ 1);
        System.out.println(3 ^ 1);
        System.out.println(2 ^ 3);
        System.out.println(1 ^ 2);

        int a = 5;
        int b = 3;
        System.out.println(a ^ b);
    }
}
