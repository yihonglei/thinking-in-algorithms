package com.jpeony.leetcode2.n1049;

import java.util.Arrays;

/**
 * [1049. 最后一块石头的重量 II](https://leetcode.cn/problems/last-stone-weight-ii/description/)
 */
public class N1049_LastStoneWeight {
    public static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i : stones) {
            sum += i;
        }

        int target = sum >> 1;
        int[] dp = new int[target + 1];

        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);

                System.out.println("i=" + i + ", j=" + j + ", dp=" + Arrays.toString(dp));
            }
        }

        return sum - 2 * dp[target];
    }

    public static void main(String[] args) {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int res = lastStoneWeightII(stones);
        System.out.println("res = " + res);
    }
}
