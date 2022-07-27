package com.jpeony.leetcode.n0704;

/**
 * [704. Binary Search](https://leetcode.com/problems/binary-search/)
 * [704. 二分查找](https://leetcode.cn.com/problems/binary-search/)
 *
 * @author yihonglei
 */
public class N704_BinarySearch {

    /**
     * 【二分查找】
     * 时间复杂度：O(log n)。二分查找每次都是二分治折半查找，所以时间复杂度为 O(log n)。
     * 空间复杂度：O(1)。只是用了临时变量 mid，所以空间复杂度为 O(1)。
     */
    private static int search(int[] nums, int target) {
        // 低位
        int low = 0;
        // 高位
        int high = nums.length - 1;
        // 注意，这里是 low <= high，不是 low < high
        while (low <= high) {
            // 中间值
            int mid = low + (high - low) / 2;
            // 中间值等于目标值
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {// 中间值大于目标值，左侧查找
                high = mid - 1;
            } else {// 中间值小于目标值，右侧查找
                low = mid + 1;
            }
        }
        // 在数组中未找到目标值，返回 -1
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int targetIndex = search(nums, target);
        System.out.println("targetIndex = " + targetIndex);
    }
}
