package com.jpeony.leetcode.n0459;

/**
 * [459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)
 * [459. 重复的子字符串](https://leetcode.cn/problems/repeated-substring-pattern/)
 *
 * @author yihonglei
 */
public class N459_RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    public static void main(String[] args) {
        String s = "ababab";
        boolean rsp = repeatedSubstringPattern(s);
        System.out.println("rsp = " + rsp);
    }
}
