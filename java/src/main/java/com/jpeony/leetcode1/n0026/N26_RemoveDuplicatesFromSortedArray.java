package com.jpeony.leetcode1.n0026;

/**
 * [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 * [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
 *
 * @author yihonglei
 */
public class N26_RemoveDuplicatesFromSortedArray {

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        // 双指针
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[left] < nums[right]) {
                nums[++left] = nums[right];
            }
            right++;
        }

        return left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println("nums length = " + removeDuplicates(nums));
    }
}
