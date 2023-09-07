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

    // KMP 算法
    // ss: 原串(string)  pp: 匹配串(pattern)
    public static int strStrKmp(String ss, String pp) {
        if (pp.isEmpty()) return 0;

        // 分别读取原串和匹配串的长度
        int n = ss.length(), m = pp.length();
        // 原串和匹配串前面都加空格，使其下标从 1 开始
        ss = " " + ss;
        pp = " " + pp;

        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();

        // 构建 next 数组，数组长度为匹配串的长度（next 数组是和匹配串相关的）
        int[] next = new int[m + 1];
        // 构造过程 i = 2，j = 0 开始，i 小于等于匹配串长度 【构造 i 从 2 开始】
        for (int i = 2, j = 0; i <= m; i++) {
            // 匹配不成功的话，j = next(j)
            while (j > 0 && p[i] != p[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++
            if (p[i] == p[j + 1]) j++;
            // 更新 next[i]，结束本次循环，i++
            next[i] = j;
        }

        // 匹配过程，i = 1，j = 0 开始，i 小于等于原串长度 【匹配 i 从 1 开始】
        for (int i = 1, j = 0; i <= n; i++) {
            // 匹配不成功 j = next(j)
            while (j > 0 && s[i] != p[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++，结束本次循环后 i++
            if (s[i] == p[j + 1]) j++;
            // 整一段匹配成功，直接返回下标
            if (j == m) return i - m;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "llhello";
        String needle = "ll";

        int i = strStrKmp(haystack, needle);

        System.out.println("strStr = " + i);
    }
}
