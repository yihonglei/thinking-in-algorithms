package com.jpeony.leetcode.n0027;

/**
 * [27. Remove Element](https://leetcode.com/problems/remove-element/)
 * [27. 移除元素](https://leetcode-cn.com/problems/remove-element/)
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
        int leftPoint = 0, rightPoint = 0;
        while (rightPoint < nums.length) {
            if (nums[rightPoint] != val) {
                nums[leftPoint++] = nums[rightPoint];
            }
            rightPoint++;
        }
        return leftPoint;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("nums length = " + removeElement(nums, val));
    }
}
