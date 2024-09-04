package com.jpeony.leetcode1.n0046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * [46. 全排列](https://leetcode.cn/problems/permutations)
 */
public class N46_permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backtracking(ans, path, nums, new boolean[nums.length]);
        return ans;
    }

    public static void backtracking(List<List<Integer>> ans, LinkedList<Integer> path, int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            System.out.println("cur-backtracking-" + i + ", path = " + path);
            backtracking(ans, path, nums, used);
            System.out.println("remove-before-backtracking-" + i + ", path = " + path);
            path.removeLast();
            System.out.println("remove-after-backtracking-" + i + ", path = " + path);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }
}
