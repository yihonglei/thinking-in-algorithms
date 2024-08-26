package com.jpeony.leetcode1.n0131;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * [131. 分割回文串](https://leetcode.cn/problems/palindrome-partitioning)
 */
public class N131_PalindromePartitioning {
    static List<List<String>> ans = new ArrayList<>();
    static Deque<String> deque = new LinkedList<>();

    public static List<List<String>> partition(String s) {
        backTracking(s, 0);
        return ans;
    }

    private static void backTracking(String s, int startIndex) {
        // 如果起始位置大于s的大小，说明找到了一组分割方案
        if (startIndex >= s.length()) {
            ans.add(new ArrayList(deque));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            // 如果是回文子串，则记录
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                deque.addLast(str);
            } else {
                continue;
            }
            // 起始位置后移，保证不重复
            backTracking(s, i + 1);
            deque.removeLast();
        }
    }

    //判断是否是回文串
    private static boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> aab = partition("aab");
        System.out.println(aab);
    }
}
