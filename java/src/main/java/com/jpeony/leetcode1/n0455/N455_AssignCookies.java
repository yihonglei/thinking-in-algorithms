package com.jpeony.leetcode1.n0455;

import java.util.Arrays;

/**
 * [455. 分发饼干](https://leetcode.cn/problems/assign-cookies)
 */
public class N455_AssignCookies {
    // 方法1：优遍历饼干【正序】
    public static int findContentChildrenOne(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        // 先考虑饼干，从小到大，饼干满足孩子的胃口，就可以分发给孩子
        int start = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                start++;
                count++;
            }
        }
        return count;
    }

    // 方法2：先遍历胃口【倒序】
    public static int findContentChildrenTwo(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int start = s.length - 1;
        for (int i = g.length - 1; i >= 0; i--) {
            if (start >= 0 && s[start] >= g[i]) {
                start--;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        int contentChildren = findContentChildrenTwo(g, s);
        System.out.println("contentChildren = " + contentChildren);
    }

}
