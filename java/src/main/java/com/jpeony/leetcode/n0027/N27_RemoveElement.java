package com.jpeony.leetcode.n0027;

/**
 * [27. Remove Element](https://leetcode.com/problems/remove-element/)
 * [27. 移除元素](https://leetcode.cn/problems/remove-element/)
 *
 * @author yihonglei
 */
public class N27_RemoveElement {

    /**
     * 【双指针】
     * 时间复杂度：O(n)。数组遍历一遍，数组长度为 n，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。算法额外增加的空间为存储临时变量固定空间，所以空间复杂度为 O(1)。
     */
    private static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("nums length = " + removeElement(nums, val));
    }
}
