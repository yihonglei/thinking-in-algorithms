package com.jpeony.leetcode1.n0135;

import java.util.Arrays;

/**
 * [135. 分发糖果](https://leetcode.cn/problems/candy)
 */
public class N135_Candy {
    public static int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int i : candy) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] ratings = new int[]{1, 0, 2};
        int candy = candy(ratings);
        System.out.println("candy = " + candy);
    }
}
