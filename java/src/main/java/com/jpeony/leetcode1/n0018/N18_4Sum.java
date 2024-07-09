package com.jpeony.leetcode1.n0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [18. 4Sum](https://leetcode.com/problems/4sum/)
 * [18. 四数之和](https://leetcode.cn/problems/4sum/)
 *
 * @author yihonglei
 */
public class N18_4Sum {

    /**
     * 【双指针 + 排序】
     * 时间复杂度：O(n^3)。三层循环嵌套，每层循环 n 次，n 为数组长度，所以时间复杂度为 O(n^3)。
     * 空间复杂度：O(n)。算法额外增量存储空间为存储返回数组的集合，空间复杂度为 O(n)，n 为满足条件的四元组个数。
     */
    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // 如果为 null 或者 数组长度小于 4，则返回空集合
        if (nums == null || nums.length < 4) {
            return ans;
        }
        // 排序
        Arrays.sort(nums);
        int n = nums.length;
        // 第一层循环
        for (int i = 0; i < n - 3; i++) {
            // 去重：如果当前值等于上一个值，组合是重复组合
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 中断：如果当前值之后的 4 个元素之和大于目标值，则没有继续找下去的必要，因为之后的值必然大于目标值
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            // 去重：当前值之前的 4 个元素之和小于目标值，组合满足不了大于目标值，循环跳过
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue;
            }
            // 第二层循环
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) {
                    continue;
                }
                int left = j + 1, right = n - 1;
                // 第三层循环
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // 去重：同等条件的事情，在做一遍组合重复，浪费时间
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        // 去重：同等条件的事情，在做一遍组合重复，浪费时间
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("fourSum = " + ans);
    }
}
