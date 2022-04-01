package com.jpeony.leetcode.n0014;

/**
 * [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)
 * [14. 最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/)
 *
 * @author yihonglei
 */
public class N14_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // 当字符数组长度为 0 时，则公共前缀为空，直接返回即可
        if (strs.length == 0) {
            return "";
        }
        // 寻找数组中最短字符串，避免寻找公共前缀时越界判断复杂性
        String minStr = strs[0];
        for (String str : strs) {
            if (minStr.length() > str.length()) {
                minStr = str;
            }
        }
        // 基于最小字符串循环顺序比较各个字符串的公共字符
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < minStr.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                // 以 a 为基准字符（最短字符串循环的各个字符，作为每一轮的基准字符）
                char a = minStr.charAt(i);
                char b = strs[j].charAt(i);
                // 如果数组中循环顺序字符串字符与 a 不相等，则不存在公共字符串
                if (a != b) {
                    return res.toString();
                } else if (j == strs.length - 1) {// 如果依次比较到数组最后一个字符串还依然坚挺相等，则是公共字符
                    res.append(a);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"dog", "racecar", "car"};

        String commonPrefix = longestCommonPrefix(strs);
        System.out.println("longestCommonPrefix = " + commonPrefix);
    }
}
