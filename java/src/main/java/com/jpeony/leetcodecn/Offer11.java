package com.jpeony.leetcodecn;

/**
 * [剑指 Offer 11. 旋转数组的最小数字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)
 *
 * @author yihonglei
 */
public class Offer11 {

    /**
     * 二分查找
     * 时间复杂度：O(logn)。
     * 空间复杂度：O(1)。
     */
    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else if (numbers[mid] < numbers[high]) {
                high = mid;
            } else {
                high -= 1;
            }
        }

        return numbers[low];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int minArray = minArray(arr);
        System.out.println("minArray = " + minArray);
    }
}
