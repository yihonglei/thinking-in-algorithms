package com.jpeony.leetcode.n0075;

import java.util.Arrays;

/**
 * [75. Sort Colors](https://leetcode.com/problems/sort-colors/)
 * [75. 颜色分类](https://leetcode.cn/problems/sort-colors/)
 *
 * @author yihonglei
 */
public class N75_SortColors {

    /**
     * 【双指针】
     * 时间复杂度：O(n)。遍历了 n 遍，n 为数组的长度，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。只有临时变量空间，不需要渐进增长空间，所以空间复杂度为 O(1)。
     */
    private static void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p2 = n - 1;
        for (int i = 0; i <= p2; i++) {
            // 2 依次从右边开始放置，用 p2 指针控制下一个要放置 2 的位置，如果往左一直是 2， 则一直放
            while (i <= p2 && nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = tmp;
                p2--;
            }
            // 0 依次从左边开始放置，用 p0 指针控制下一个要放置 0 的位置
            if (nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = tmp;
                p0++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] nums = {1, 2, 0, 1};
        System.out.println("sort before = " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("sort before = " + Arrays.toString(nums));
    }
}
