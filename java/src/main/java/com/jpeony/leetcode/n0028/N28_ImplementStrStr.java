package com.jpeony.leetcode.n0028;

/**
 * [28. Implement strStr()](https://leetcode.com/problems/implement-strstr/)
 *
 * @author yihonglei
 */
public class N28_ImplementStrStr {

    /**
     * 【滑动窗口】
     * 时间复杂度：O(m*n)。m 为 haystack 字符长度，n 为 needle 字符长度；
     * 空间复杂度：O(1)。除了临时变量，不需要额外渐进增长空间；
     */
    private static int strStr(String haystack, String needle) {
        int m = needle.length();

        if (m == 0) {
            return 0;
        }

        int n = haystack.length();
        if (n < m) {
            return -1;
        }

        int i = 0;
        int j = 0;

        while (i < n - m + 1) {
            while (i < n && haystack.charAt(i) != needle.charAt(j)) {
                i++;
            }

            // 没有找到首字母相等，不可能找到子串，直接按题意返回 -1
            if (i == n) {
                return -1;
            }
            // 遍历后续字符，判断是否相等
            i++;
            j++;
            while (i < n && j < m && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {// 找到
                return i - j;
            } else {// 未找到，haystack 字符移动到下一个位置，接着找
                i -= j - 1;
                j = 0;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int i = strStr(haystack, needle);

        System.out.println("strStr = " + i);
    }
}
