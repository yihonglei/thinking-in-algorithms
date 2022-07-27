package com.jpeony.leetcode.n0287;

import java.util.HashMap;

/**
 * [287. Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)
 * [287. 寻找重复数](https://leetcode.cn.com/problems/find-the-duplicate-number/)
 *
 * @author yihonglei
 */
public class N287_FindTheDuplicateNumber {

    /**
     * 时间复杂度：O(n)。n 为数组长度。
     * 空间复杂度：O(1)。只需要临时变量空间。
     */
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while (pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }

    /**
     * 时间复杂度：O(n)。n 为数组长度。
     * 空间复杂度：O(n)。n 为数组长度，HashMap 存储元素个数。
     */
    public static int findDuplicateHashMap(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i : nums) {
            if (maps.get(i) != null) {
                return i;
            }
            maps.put(i, i);
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        int duplicate = findDuplicate(nums);
        System.out.println("findDuplicate = " + duplicate);
    }
}
