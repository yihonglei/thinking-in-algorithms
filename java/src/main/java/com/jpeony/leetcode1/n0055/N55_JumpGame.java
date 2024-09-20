package com.jpeony.leetcode1.n0055;

/**
 * [55. 跳跃游戏](https://leetcode.cn/problems/jump-game/)
 *
 * @author yihonglei
 */
public class N55_JumpGame {

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int coverRange = 0;
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if (coverRange >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean b = canJump(nums);
        System.out.println("b = " + b);
    }
}
