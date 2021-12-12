package com.jpeony.leetcodecn.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * [两数之和] https://leetcode-cn.com/problems/two-sum/
 *
 * @author yihonglei
 */
public class TwoSum {
    /**
     * 【哈希表】
     * 时间复杂度：根据循环次数，关注循环代码，所以时间复杂度为 O(n)
     * 空间复杂度：每次循环的值都加入到内存中，所以空间复杂度为 O(n)
     */
    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }

            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        // 哈希表
        int[] resTwo = twoSum(nums, target);
        System.out.println("哈希表：" + Arrays.toString(resTwo));
    }
}
