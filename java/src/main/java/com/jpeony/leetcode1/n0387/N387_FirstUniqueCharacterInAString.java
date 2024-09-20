package com.jpeony.leetcode1.n0387;

import java.util.HashMap;

/**
 * [387. 字符串中的第一个唯一字符](https://leetcode.cn/problems/first-unique-character-in-a-string)
 */
public class N387_FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (map.get(key) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int firstUniqChar = firstUniqChar(s);
        System.out.println("firstUniqChar = " + firstUniqChar);
    }
}
