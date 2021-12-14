package com.jpeony.leetcode.n0026;

/**
 * [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 * [26. 删除有序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/)
 *
 * @author yihonglei
 */
public class N26_RemoveDuplicatesFromSortedArray {

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        // 双指针
        int leftPoint = 0, rightPoint = 1;
        while (rightPoint < nums.length) {
            if (nums[leftPoint] < nums[rightPoint]) {
                nums[++leftPoint] = nums[rightPoint];
            }
            rightPoint++;
        }

        return leftPoint + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println("nums length = " + removeDuplicates(nums));
    }
}
