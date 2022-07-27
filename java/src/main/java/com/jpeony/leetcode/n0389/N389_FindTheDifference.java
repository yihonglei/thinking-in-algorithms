package com.jpeony.leetcode.n0389;

/**
 * [389. Find the Difference](https://leetcode.com/problems/find-the-difference/)
 * [389. 找不同](https://leetcode.cn/problems/find-the-difference/)
 *
 * @author yihonglei
 */
public class N389_FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int res = 0;

        for (char c : tArr) {
            res ^= c;
        }

        for (char c : sArr) {
            res ^= c;
        }

        return (char) res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        int c = findTheDifference(s, t);
        System.out.println("findTheDifference = " + c);
    }
}
