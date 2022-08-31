package com.jpeony.leetcode.n0076;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
 * [76. 最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/)
 *
 * @author yihonglei
 */
public class N76_MinimumWindowSubstring {

    /**
     * 记录 t 中字符出现的次数
     */
    private static HashMap<Character, Integer> tMap = new HashMap<>();
    /**
     * 记录窗口字符出现的次数
     */
    private static HashMap<Character, Integer> subMap = new HashMap<>();

    public static String minWindow(String s, String t) {
        // 记录 t 中字符出现的次数
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        // 通过滑动窗口寻找目标子串
        int left = 0;
        int right = 0;
        // 目标子串的左右指针
        int ansL = -1;
        int ansR = -1;
        int len = Integer.MAX_VALUE; // 符合条件子串的长度
        while (right < s.length()) {
            if (tMap.containsKey(s.charAt(right))) {
                subMap.put(s.charAt(right), subMap.getOrDefault(s.charAt(right), 0) + 1);
            }
            // 左边逼近
            while (check(tMap, subMap) && left <= right) {
                // 滑动窗口范围
                if (right - left + 1 < len) {
                    len = right - left + 1;
                    ansL = left;
                    ansR = left + len;
                }
                // 滑动后减少移动位的字符出现次数
                if (subMap.containsKey(s.charAt(left))) {
                    subMap.put(s.charAt(left), subMap.getOrDefault(s.charAt(left), 0) - 1);
                }
                left++;
            }
            right++;
        }

        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    /**
     * 比较两个 map 是否相等
     */
    private static boolean check(HashMap<Character, Integer> tMap, HashMap<Character, Integer> subMap) {
        Iterator iter = tMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (subMap.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String minWindow = minWindow(s, t);
        System.out.println("minWindow = " + minWindow);
    }
}
