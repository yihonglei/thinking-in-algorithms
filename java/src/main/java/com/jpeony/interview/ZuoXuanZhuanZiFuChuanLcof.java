package com.jpeony.interview;

/**
 * [剑指 Offer 58 - II. 左旋转字符串](https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/)
 *
 * @author yihonglei
 */
public class ZuoXuanZhuanZiFuChuanLcof {
    public static String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = n; i < ch.length; i++) {
            sb.append(ch[i]);
        }

        for (int i = 0; i < n; i++) {
            sb.append(ch[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String sNew = reverseLeftWords(s, k);

        System.out.println("sNew = " + sNew);
    }
}
