package com.jpeony.leetcode.n0078;

import java.util.ArrayList;
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
        backTracking(0, nums, ans, new ArrayList<>());
        // 返回结果
        return ans;
    }

    private static void backTracking(int i, int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp) {
        // 每个子集放入返回结果
        ans.add(new ArrayList<>(temp));
        System.out.println("i = " + i + ", ans = " + ans + ", cur = " + temp);
        // 寻找符合条件的子集合
        for (int j = i; j < nums.length; j++) {
            temp.add(nums[j]);
            // 递归
            backTracking(j + 1, nums, ans, temp);
            System.out.println("backtrack-before = " + ans);
            // 撤销处理结点，回溯过程
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println("subsets = " + subsets);
    }
}
