package com.jpeony.leetcode1.n0078;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * [78. Subsets](https://leetcode.com/problems/subsets/)
 * [78. 子集](https://leetcode.cn/problems/subsets/)
 *
 * @author yihonglei
 */
public class N78_Subsets {
    /**
     * 【回溯算法】
     * 时间复杂度：O(n×2^n)。一共 2^n 个状态，每种状态需要 O(n) 的时间来构造子集。
     * 空间复杂度：O(n)。渐进空间为存储子集的临时列表，n 为子集个数，所以空间复杂度为 O(n)。
     */
    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backtracking(ans, path, nums, 0);
        return ans;
    }

    private static void backtracking(List<List<Integer>> ans, LinkedList<Integer> path, int[] nums, int startIndex) {
        ans.add(new ArrayList<>(path));
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            System.out.println("cur：i=" + i + " path = " + path.toString());
            backtracking(ans, path, nums, i + 1);
            System.out.println("remove before：i=" + i + " path = " + path.toString());
            path.remove(path.size() - 1);
            System.out.println("remove after ：i=" + i + " path = " + path.toString());
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println("subsets = " + subsets);
    }
}
