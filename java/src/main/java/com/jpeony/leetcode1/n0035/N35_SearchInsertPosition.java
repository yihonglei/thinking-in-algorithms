package com.jpeony.leetcode1.n0035;

/**
 * [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)
 * [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/)
 *
 * @author yihonglei
 */
public class N35_SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        // 返回值
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        int res = searchInsert(nums, target);
        System.out.println("res = " + res);
    }
}
