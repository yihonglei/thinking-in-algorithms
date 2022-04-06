package com.jpeony.leetcode.n0030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [30. Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
 * [30. 串联所有单词的子串](https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/)
 *
 * @author yihonglei
 */
public class N30_SubstringWithConcatenationOfAllWords {

    /**
     * 滑动窗口，用 HashMap 解决单词顺序组合判断的困难
     * 时间复杂度：O(m+n)。n 为字符串长度，m 为单词个数。
     * 空间复杂度：O(m)。m 为所有单词长度总和。
     */
    public static List<Integer> findSubstring(String s, String[] words) {
        // allWords 记录 words 中单词出现的次数
        Map<String, Integer> allWords = new HashMap<>();
        for (String word : words) {
            allWords.put(word, allWords.getOrDefault(word, 0) + 1);
        }
        int wordNum = words.length; // 单词个数
        int wordLen = words[0].length(); // 单词长度
        int allLen = wordNum * wordLen; // 所有单词的总长度
        List<Integer> res = new ArrayList<>();
        // 遍历字符串，移动长度为 allLen 的滑动窗口
        for (int i = 0; i < s.length() - allLen + 1; i++) {
            // subWords 记录窗口子串中单词出现的次数
            Map<String, Integer> subWords = new HashMap<>();
            // allLen 个窗口匹配字符串是否符号题意
            int j = i;
            while (j < i + allLen) {
                // 按单个单词长度从字符串中截取单词
                String curWord = s.substring(j, j + wordLen);
                // 出现不存在 allWords 中的单词，或者这个单词在子串中出现的次数已经等于 allWords 中的次数，
                // 滑动窗口就不符合要求，直接 break 进入下一个滑动窗口的匹配
                if (!allWords.containsKey(curWord) || subWords.get(curWord) == allWords.get(curWord)) {
                    break;
                }
                subWords.put(curWord, subWords.getOrDefault(curWord, 0) + 1);
                j += wordLen;
            }
            // 单轮循环子串包含了所有单词，则按某种方式组合后必然符合题意
            if (j == i + allLen) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};

        List<Integer> substring = findSubstring(s, words);
        System.out.println("findSubstring = " + substring);
    }
}
