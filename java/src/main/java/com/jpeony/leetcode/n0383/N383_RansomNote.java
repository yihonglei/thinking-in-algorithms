package com.jpeony.leetcode.n0383;

import java.util.HashMap;

/**
 * [383. Ransom Note](https://leetcode.com/problems/ransom-note/)
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

        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        char[] aArr = ransomNote.toCharArray();
        char[] bArr = magazine.toCharArray();

        // 分别统计字符串字符出现次数
        for (Character ac : aArr) {
            aMap.merge(ac, 1, Integer::sum);
        }
        for (Character bc : bArr) {
            bMap.merge(bc, 1, Integer::sum);
        }
        // 每个字符出现次数比对
        for (char c : aArr) {
            if (bMap.get(c) == null) {
                return false;
            }
            if (bMap.get(c) < aMap.get(c)) {
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
