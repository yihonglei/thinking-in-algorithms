package com.jpeony.leetcode1.n0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * [90. Subsets II](https://leetcode.com/problems/subsets-ii/)
 * [90. 子集 II](https://leetcode.cn/problems/subsets-ii/)
 *
 * @author yihonglei
 */
public class N90_SubsetsII {
    /**
     * 【回溯算法】
     * 时间复杂度：O(n×2^n)。一共 2^n 个状态，每种状态需要 O(n) 的时间来构造子集。
     * 空间复杂度：O(n)。渐进空间为存储子集的临时列表，n 为子集个数，所以空间复杂度为 O(n)。
     */
    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        // 排序，底层基于快排实现
        Arrays.sort(nums);
        backtracking(ans, path, nums, 0);
        return ans;
    }

    private static void backtracking(List<List<Integer>> ans, LinkedList<Integer> path, int[] nums, int startIndex) {
        // 结果收集
        ans.add(new ArrayList<>(path));
        // for 循环，循环结束为递归退出的条件
        for (int i = startIndex; i < nums.length; i++) {
            // 剪枝：对于相同元素，组成的子集重复排除
            if (i != startIndex && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            // 递归
            backtracking(ans, path, nums, i + 1);
            // 回溯，已处理节点撤销
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> subsetsWithDup = subsetsWithDup(nums);
        System.out.println("subsetsWithDup = " + subsetsWithDup);
    }
}
