package com.jpeony.leetcode.n0202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)
 * [349. 两个数组的交集](https://leetcode-cn.com/problems/intersection-of-two-arrays/)
 *
 * @author yihonglei
 */
public class N202_IntersectionOfTwoArrays {

    /**
     * 【哈希表】
     * 时间复杂度：O(m+n)。如果对 m 或者 n 是知道大小的，那么我们就可以根据加法法则确定时间复杂度为 O(m) 或者 O(n)，
     * 但是 m 和 n 大小是无法确定的，任何一块都不能忽略，所以时间复杂度为 O(m+n)。
     * 空间复杂度：O(m+n)。maps1 和 maps2 不能确定那个大小，同时间复杂度分析一样，任何一块都不能忽略，所以空间复杂度为 O(m+n)。
     */
    private static int[] intersection(int[] nums1, int[] nums2) {
        // HashSet 底层基于 HashMap 实现 key 是存入元素，value 是 new Object()，所以天然支持去重
        HashSet<Integer> maps1 = new HashSet<>();
        HashSet<Integer> maps2 = new HashSet<>();
        for (int i : nums1) {
            maps1.add(i);
        }
        for (int j : nums2) {
            maps2.add(j);
        }

        // 去重后取交集
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer n : maps1) {
            if (maps2.contains(n)) {
                list.add(n);
            }
        }
        // 转换为数组
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] res = intersection(nums1, nums2);
        System.out.println("res = " + Arrays.toString(res));
    }
}
