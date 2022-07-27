package com.jpeony.leetcode.n0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [15. 3Sum](https://leetcode.com/problems/3sum/)
 * [15. 三数之和](https://leetcode.cn.com/problems/3sum/)
 *
 * @author yihonglei
 */
public class N15_3Sum {

    /**
     * 【排序 + 双指针】
     * 时间复杂度：O(n^2)。两层 n 次循环，根据乘法法则，时间复杂度为 O(n^2)。
     * 空间复杂度：O(n)。返回数组的存储空间。
     */
    private static List<List<Integer>> threeSum(int[] nums) {
        // 返回结果
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return ans;
        }
        // 正序排序
        Arrays.sort(nums);
        int n = nums.length;
        // 组合判断
        for (int i = 0; i < n; i++) {
            /*
             * 优化：提前退出。数组排序后，依赖的是负值和正值才可能求和为0
             */
            if (nums[i] > 0) {
                break;
            }
            /*
             * 去重：相同的元素不重复处理
             */
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重：相同的元素不重复处理
                    while (left < right && nums[left] == nums[++left]) ; // 往后移
                    while (left < right && nums[right] == nums[--right]) ; // 往前移
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {3, -2, 1, 0};
//        int[] nums = {-1, 0, 1, 0};
        List<List<Integer>> res = threeSum(nums);
        System.out.println("threeSum = " + res);
    }
}
