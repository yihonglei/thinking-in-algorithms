package com.jpeony.leetcode.n0242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * [242. 有效的字母异位词](https://leetcode.cn/problems/valid-anagram/)
 *
 * @author yihonglei
 */
public class N242_ValidAnagram {

    /**
     * 【排序】
     * 时间复杂度：O(nlogn)。n 为字符串的长度，Arrays.sort() 排序时间复杂度为 O(nlogn)，Arrays.equals(sArr, tArr) 比较时间复杂度为 O(n)，
     * 根据加法法则，时间复杂度为 O(nlogn)。
     * 空间复杂度：O(logn)。排序需要 O(logn) 的空间复杂度。
     */
    private static boolean isAnagramSort(String s, String t) {
        // 两个字符串长度不等，必然不是字母异位词
        if (s.length() != t.length()) {
            return false;
        }

        // 转换为数组
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // 快速排序
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // 两个数组顺序比较每一位是否相同，全部相同则返回 true，否则返回 false
        return Arrays.equals(sArr, tArr);
    }

    /**
     * 【哈希表】
     * 时间复杂度：O(n)。字符串如果小于 26 个字母， n 为 26，如果大于 26，n 为字符串字符个数。
     * 空间复杂度：O(s)。s 为字符串去重后字符个数。
     */
    private static boolean isAnagramHash(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 统计字符串 s 中字母出现次数
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        // 根据 t 中字符，计算是否都在 s 中
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            // 对应字符次数减 1，如果某个字符在 s 中和 t 中出现的总次数不一样，则不是异位词
            sMap.put(ch, sMap.getOrDefault(ch, 0) - 1);
            if (sMap.get(ch) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aaa";
        String t = "aab";

        boolean anagramSort = isAnagramSort(s, t);
        System.out.println("anagramSort = " + anagramSort);

        boolean anagramHash = isAnagramHash(s, t);
        System.out.println("anagramHash = " + anagramHash);
    }
}
