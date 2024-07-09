package com.jpeony.leetcode1.n0575;

import java.util.HashMap;

/**
 * [575.分糖果](https://leetcode.cn/problems/distribute-candies/description/)
 *
 * @author yihonglei
 */
public class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        // 计算糖果种类
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = 0;
        for (int i : candyType) {
            if (map.get(i) == null) {
                map.put(i, 1);

                num += 1;
            }
        }

        // 仅吃糖果数
        int maxNum = candyType.length / 2;

        // 最多能吃的糖果数
        int res = 0;
        if (num <= maxNum) {
            res = num;
        } else {
            res = maxNum;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int i = distributeCandies(candyType);
        System.out.println("最多能吃到的糖果数=" + i);
    }
}
