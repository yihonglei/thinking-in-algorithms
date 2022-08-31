package com.jpeony.leetcode.n0151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
 * [151. 翻转字符串里的单词](https://leetcode.cn/problems/reverse-words-in-a-string/)
 *
 * @author yihonglei
 */
public class N151_ReverseWordsInAString {

    /**
     * 【迭代】
     * 时间复杂度：O(n)。n 为空格切割字符串数组的长度；
     * 空间复杂度：O(n)。n 为单词个数；
     */
    private static String reverseWordsIterator(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 字符串切割
        String[] arr = s.split(" ");
        // 字符串封装
        StringBuilder sb = new StringBuilder();
        // 字符串数组倒序迭代拼接
        for (int i = arr.length - 1; i >= 0; i--) {
            String temp = arr[i];
            if (!temp.equals("")) {
                sb.append(temp);
                if (i != 0) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString();
    }

    private static String reverseWordsTwoPoint(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println("reverseBefore = " + s);

        String reverseAfter = reverseWordsIterator(s);

        System.out.println("reverseAfter = " + reverseAfter);
    }
}
