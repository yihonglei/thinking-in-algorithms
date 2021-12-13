package com.jpeony.leetcode.n0001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * [1. Two Sum](https://leetcode.com/problems/two-sum/)
 * [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)
 *
 * @author yihonglei
 */
public class N1_TwoSum {
    /**
     * 【哈希表】
     * 时间复杂度：O(n)。整个代码循环了 n 次，n 为数组的长度，所以时间复杂度为 O(n)；
     * 空间复杂度：O(n)。每次遍历都往 map 存放一次元素，遍历次数 n 为数组长度，所以空间复杂度为 O(n)；
     */
    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.get(x) != null) {
                return new int[]{map.get(x), i};
            }

            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] resTwo = twoSum(nums, target);
        System.out.println("哈希表：" + Arrays.toString(resTwo));
    }
}
