package com.jpeony.leetcode1.n0162;

/**
 * [162. Find Peak Element](https://leetcode.com/problems/find-peak-element/)
 * [162. 寻找峰值](https://leetcode.cn/problems/find-peak-element/)
 *
 * @author yihonglei
 */
public class N162_FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 往左坡走
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else { // 往右坡走
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};

        int peakElement = findPeakElement(nums);
        System.out.println("peakElement = " + peakElement);
    }
}
