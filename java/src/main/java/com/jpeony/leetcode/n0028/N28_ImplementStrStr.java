package com.jpeony.leetcode.n0028;

/**
 * [28. Implement strStr()](https://leetcode.com/problems/implement-strstr/)
 * [28. 找出字符串中第一个匹配项的下标](https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/)
 *
 * @author yihonglei
 */
public class N28_ImplementStrStr {

    /**
     * 【朴素匹配】
     * 时间复杂度：O(m*n)。m 为 haystack 字符长度，n 为 needle 字符长度；
     * 空间复杂度：O(1)。除了临时变量，不需要额外渐进增长空间；
     */
    private static int strStr(String s, String p) {
        int n = s.length(), m = p.length();

        char[] sArr = s.toCharArray(), pArr = p.toCharArray();
        for (int i = 0; i <= n - m; i++) {
            int a = i, b = 0;
            while (b < m && sArr[a] == pArr[b]) {
                a++;
                b++;
            }

            if (b == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "llhello";
        String needle = "ll";

        int i = strStr(haystack, needle);

        System.out.println("strStr = " + i);
    }
}
