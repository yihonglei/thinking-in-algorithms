package com.jpeony.leetcode1.n0392;

/**
 * [392. 判断子序列](https://leetcode.cn/problems/is-subsequence)
 */
public class N392_IsSubsequenc {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < t.length() && index < s.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
        }
        return index == s.length();
    }

    public static void main(String[] args) {
        String s = "a", t = "abc";
        boolean sb = isSubsequence(s, t);
        System.out.println("sb = " + sb);
    }
}
