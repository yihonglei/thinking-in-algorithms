package com.jpeony.leetcode.n0055;

/**
 * [55. 跳跃游戏](https://leetcode.cn/problems/jump-game/)
 *
 * @author yihonglei
 */
public class N55_JumpGame {

    public static boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean b = canJump(nums);
        System.out.println("b = " + b);
    }
}
