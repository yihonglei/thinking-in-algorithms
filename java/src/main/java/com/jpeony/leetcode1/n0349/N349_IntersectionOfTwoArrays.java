package com.jpeony.leetcode1.n0349;

import java.util.Arrays;
import java.util.HashSet;

/**
 * [349. 两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/)
 *
 * @author yihonglei
 */
public class N349_IntersectionOfTwoArrays {

    private static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        // nums1 去掉重复元素
        for (int i : nums1) {
            set1.add(i);
        }
        // 遍历 nums2，判断元素是否在 nums1 中，通过 HashSet 特性去重
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }

        // 将结果转换为数组
        int[] resArr = new int[resSet.size()];
        int index = 0;
        //将结果几何转为数组
        for (int i : resSet) {
            resArr[index++] = i;
        }
        return resArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] res = intersection(nums1, nums2);
        System.out.println("res = " + Arrays.toString(res));
    }
}
