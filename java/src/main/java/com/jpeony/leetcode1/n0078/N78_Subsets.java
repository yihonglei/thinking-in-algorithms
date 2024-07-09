package com.jpeony.leetcode1.n0078;

import java.util.ArrayList;
import java.util.List;

/**
 * [78. Subsets](https://leetcode.com/problems/subsets/)
 * [78. 子集](https://leetcode.cn/problems/subsets/)
 *
 * @author yihonglei
 */
public class N78_Subsets {

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();

    /**
     * 【回溯算法】
     * 时间复杂度：O(n×2^n)。一共 2^n 个状态，每种状态需要 O(n) 的时间来构造子集。
     * 空间复杂度：O(n)。渐进空间为存储子集的临时列表，n 为子集个数，所以空间复杂度为 O(n)。
     */
    private static List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    private static void backTracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(temp));
        for (int i = startIndex; i < nums.length; i++) {
            temp.add(nums[i]);
            backTracking(nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println("subsets = " + subsets);
    }
}
