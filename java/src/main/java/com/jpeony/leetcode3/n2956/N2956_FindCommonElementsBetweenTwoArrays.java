package com.jpeony.leetcode3.n2956;

import java.util.Arrays;
import java.util.HashSet;

/**
 * [2956. 找到两个数组中的公共元素](https://leetcode.cn/problems/find-common-elements-between-two-arrays)
 */
public class N2956_FindCommonElementsBetweenTwoArrays {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int x : nums2) {
            set2.add(x);
        }

        int[] ans = new int[2];
        for (int x : nums1) {
            if (set2.contains(x)) {
                ans[0] = ans[0] + 1;
            }
        }
        for (int x : nums2) {
            if (set1.contains(x)) {
                ans[1] = ans[1] + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        int[] ans = findIntersectionValues(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
