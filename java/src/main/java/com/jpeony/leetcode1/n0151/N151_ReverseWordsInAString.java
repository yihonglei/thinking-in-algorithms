package com.jpeony.leetcode1.n0151;

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
        // 去除前后空格
        s.trim();

        int left = s.length() - 1;
        int right = left;
        StringBuilder sb = new StringBuilder();
        while (left >= 0) {
            // 左指针向左一直走，直到遇到第一个空格
            while (left >= 0 && s.charAt(left) !=' ') left--;
            // 截取单词
            sb.append(s.substring(left + 1, right + 1)).append(" ");
            // 左指针继续向左走，刨掉空格，直到遇到第一个非空格
            while (left >= 0 && s.charAt(left) == ' ') left--;
            // 挪动右指针，到下一单词的末尾位置
            right = left;
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println("reverseBefore = " + s);

        String reverseAfter = reverseWordsIterator(s);

        System.out.println("reverseAfter = " + reverseAfter);
    }
}
