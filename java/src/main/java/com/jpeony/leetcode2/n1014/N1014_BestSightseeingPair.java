package com.jpeony.leetcode2.n1014;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * [1014. 最佳观光组合](https://leetcode.cn/problems/best-sightseeing-pair)
 */
public class N1014_BestSightseeingPair {
    // 方法1：回溯算法，leetcode 运行超时
    public static int maxScoreSightseeingPairTracking(int[] values) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(values, list, new LinkedList<>(), 0);

        int max = Integer.MIN_VALUE;
        for (List<Integer> e : list) {
            max = Math.max(max, values[e.get(0)] + values[e.get(1)] + e.get(0) - e.get(1));
            System.out.println("i=" + e.get(0) + ", j=" + e.get(1) + ", max=" + max);
        }
        return max;
    }

    public static void backtracking(int[] values, List<List<Integer>> list, LinkedList<Integer> path, int startIndex) {
        if (path.size() == 2) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < values.length; i++) {
            path.add(i);
            backtracking(values, list, path, i + 1);
            path.removeLast();
        }
    }

    // 方法2：动态规划
    public static int maxScoreSightseeingPairDP(int[] values) {
        int ans = 0;
        int n = values.length;
        int dp = values[0];  // 维护前面所有values[i]+i的最大值
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, dp + values[i] - i);  // 先更新答案
            dp = Math.max(dp, values[i] + i);  // 再更新状态
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] values = {8, 1, 5, 2, 6};
        // int max = maxScoreSightseeingPairTracking(values); // 回溯算法
        int max = maxScoreSightseeingPairDP(values); // 动态规划
        System.out.println("max = " + max);
    }
}
