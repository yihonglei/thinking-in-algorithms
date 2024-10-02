package com.jpeony.leetcode1.n0058;

/**
 * [58. 最后一个单词的长度](https://leetcode.cn/problems/length-of-last-word)
 */
public class N58_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else if (len != 0) {
                return len;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int i = lengthOfLastWord(s);
        System.out.println("i = " + i);
    }
}
