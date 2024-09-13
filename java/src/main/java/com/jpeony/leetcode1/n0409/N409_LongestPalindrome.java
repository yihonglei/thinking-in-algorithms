package com.jpeony.leetcode1.n0409;

import java.util.HashMap;

/**
 * [409. 最长回文串](https://leetcode.cn/problems/longest-palindrome)
 */
public class N409_LongestPalindrome {
    public static int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        HashMap<Character, Character> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int count = 0;// 字母成对数
        for (char c : arr) {
            if (map.containsKey(c)) {
                count++;
                map.remove(c);
            } else {
                map.put(c, c);
            }
        }

        int len = 1;
        if (count == 0) {
            len = 1;
        } else if (count * 2 == s.length()) {
            len = count * 2;
        } else if (count * 2 < s.length()) {
            len = count * 2 + 1;
        }

        return len;
    }

    public static void main(String[] args) {

    }
}
