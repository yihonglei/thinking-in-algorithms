package com.jpeony.leetcode.n0242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)
 * [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)
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

        char[] cArr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // 分别统计字符串字符出现次数
        for (int i = 0; i < sArr.length; i++) {
            Character sc = sArr[i];
            Character tc = tArr[i];
            sMap.merge(sc, 1, Integer::sum);
            tMap.merge(tc, 1, Integer::sum);
        }
        // 每个字符出现次数比对
        for (char c : cArr) {
            // 某个字符在字符串出现次数不相等，说明不是字母异位词
            if (!Objects.equals(sMap.get(c), tMap.get(c))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean anagramSort = isAnagramSort(s, t);
        System.out.println("anagramSort = " + anagramSort);

        boolean anagramHash = isAnagramHash(s, t);
        System.out.println("anagramHash = " + anagramHash);
    }
}
