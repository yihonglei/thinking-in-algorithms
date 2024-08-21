package com.jpeony.leetcode1.n0216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * [216. 组合总和 III](https://leetcode.cn/problems/combination-sum-iii)
 */
public class N216_CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(1, k, n, new LinkedList<Integer>(), ans);
        return ans;
    }

    public static void backtracking(int startIndex, int k, int n, LinkedList<Integer> path, List<List<Integer>> ans) {
        if (path.size() == k) {
            int sum = 0;
            for (int i : path) {
                sum += i;
            }
            if (sum == n) {
                ans.add(new LinkedList<>(path));
            }
        }

        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            backtracking(i + 1, k, n, path, ans);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = combinationSum3(3, 9);
        System.out.println(lists.toString());
    }
}
