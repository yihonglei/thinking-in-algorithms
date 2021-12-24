package com.jpeony.leetcode.n0078;

import java.util.ArrayList;
import java.util.List;

/**
 * [78. Subsets](https://leetcode.com/problems/subsets/)
 * [78. 子集](https://leetcode-cn.com/problems/subsets/)
 *
 * @author yihonglei
 */
public class N78_Subsets {

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }

    private static void backtrack(int i, int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp) {
        // 每个子集放入返回结果
        ans.add(new ArrayList<>(temp));
        System.out.println("i = " + i + ", ans = " + ans + ", cur = " + temp);
        // 寻找符合条件的子集合
        for (int j = i; j < nums.length; j++) {
            temp.add(nums[j]);
            backtrack(j + 1, nums, ans, temp);
            System.out.println("backtrack-before = " + ans);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println("subsets = " + subsets);
    }
}
