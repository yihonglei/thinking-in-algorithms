package com.jpeony.leetcode.n0003;

import java.util.HashMap;

/**
 * [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 * [3. 无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)
 *
 * @author yihonglei
 */
public class N3_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        // 记录字符在字符串中的对应下标位置
        HashMap<Character/*字符串字符*/, Integer/*字符串字符对应的下标*/> map = new HashMap<Character, Integer>();
        // 最大子串长度
        int max = 0;
        // 左指针
        int left = 0;
        // 右指针
        int right = 0;
        while (right < s.length()) {
            // 左指针最新位置：如果字符在 map 中，左指针位置为当前字符曾经出现的位置与当前 left 比较的最大值，避免left 回退回去的场景
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            // 字符下标记录
            map.put(s.charAt(right), right);
            // 最大子串长度：右指针位置与左指针位置做差，为窗口范围，无数个窗口的最大值为最大子串长度
            max = Math.max(max, right - left + 1);
            // 右指针往右移动
            right++;
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abba";

        int longest = lengthOfLongestSubstring(s);
        System.out.println("lengthOfLongestSubstring = " + longest);
    }
}
