package com.jpeony.leetcodecn;

/**
 * [剑指 Offer 51. 数组中的逆序对](https://leetcode.cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)
 *
 * @author yihonglei
 */
public class Offer51 {

    /**
     * 暴力求解（执行通过不了（~-~））
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public static int reversePairsForce(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    /**
     * 归并排序
     * 时间复杂度：O(nlogn)。
     * 空间复杂度：O(n)。
     */
    public static int reversePairs(int[] nums) {
        int len = nums.length;

        if (len < 2) {
            return 0;
        }

        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }

        int[] temp = new int[len];
        return reversePairs(copy, 0, len - 1, temp);
    }

    private static int reversePairs(int[] nums, int left, int right, int[] temp) {
        if (left == right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int leftPairs = reversePairs(nums, left, mid, temp);
        int rightPairs = reversePairs(nums, mid + 1, right, temp);

        if (nums[mid] <= nums[mid + 1]) {
            return leftPairs + rightPairs;
        }

        int crossPairs = mergeAndCount(nums, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }

    private static int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }

        int i = left;
        int j = mid + 1;

        int count = 0;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
                count += (mid - i + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 4};
        int pairs = reversePairs(arr);
        System.out.println("reversePairs = " + pairs);
    }
}
