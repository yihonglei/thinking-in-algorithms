package com.jpeony.leetcode1.n0077;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * [77. 组合](https://leetcode.cn/problems/combinations)
 */
public class N77_Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(1, n, k, new LinkedList<Integer>(), ans);
        return ans;
    }

    public static void backtracking(int startIndex, int n, int k, LinkedList<Integer> path, List<List<Integer>> ans) {
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtracking(i + 1, n, k, path, ans);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        combine(4, 2);
    }
}
