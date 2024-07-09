package com.jpeony.leetcode1.n0383;

import java.util.HashMap;
import java.util.Map;

/**
 * [383. 赎金信](https://leetcode.cn/problems/ransom-note/)
 *
 * @author yihonglei
 */
public class N383_RansomNote {

    /**
     * 【哈希表】
     * 时间复杂度：O(m + n)。m 为 ransomNote 的长度，n 为 magazine 的长度，不知道哪个字符串长，只能同时算上。
     * 空间复杂度：O(m + n)。额外空间为字符去重单词数，m 为 ransomNote 去重字符数，n 为 magazine 去重单词数。
     */
    private static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        // 统计每个字符串中每个字符出现的次数
        Map<Character, Integer> rMap = new HashMap<Character, Integer>();
        Map<Character, Integer> mMap = new HashMap<Character, Integer>();

        char[] rArr = ransomNote.toCharArray();
        char[] mArr = magazine.toCharArray();

        for (Character rCh : rArr) {
            rMap.put(rCh, rMap.getOrDefault(rCh, 0) + 1);
        }

        for (Character mCh : mArr) {
            mMap.put(mCh, mMap.getOrDefault(mCh, 0) + 1);
        }

        // 如果 ransomNote 中出现的字符次数大于  magazine 中出现字符次数，说明 magazine 中字符无法组成 ransomNote
        for (Character temp : rMap.keySet()) {
            if (rMap.get(temp) > mMap.getOrDefault(temp, 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean b = canConstruct(ransomNote, magazine);
        System.out.println("canConstruct = " + b);
    }
}
