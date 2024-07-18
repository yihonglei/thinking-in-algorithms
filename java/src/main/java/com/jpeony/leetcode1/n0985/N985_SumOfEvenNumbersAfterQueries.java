package com.jpeony.leetcode1.n0985;

import java.util.Arrays;

/**
 * [985. 查询后的偶数和](https://leetcode.cn/problems/sum-of-even-numbers-after-queries/description/)
 */
public class N985_SumOfEvenNumbersAfterQueries {
    // 暴力求解超时
//    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
//        int[] res = new int[queries.length];
//        for (int i = 0; i < queries.length; i++) {
//            int val = queries[i][0];
//            int index = queries[i][1];
//            nums[index] += val;
//            int sum = 0;
//            for (int num : nums) {
//                if (num % 2 == 0) {
//                    sum += num;
//                }
//            }
//            res[i] = sum;
//        }
//        return res;
//    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res = new int[queries.length];
        // 计算偶数和
        int sum = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        // 计算每次偶数和的变化
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            // 如果是偶数，先从偶数总和里面减掉
            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }
            // 加上val，判断奇偶性，如果加上val是偶数，就加回偶数总和，否则就不加
            nums[index] += val;
            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }

            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] res = sumEvenAfterQueries(nums, queries);
        System.out.println("res = " + Arrays.toString(res));
    }
}
