package com.jpeony.interview;

/**
 * [剑指 Offer 05. 替换空格](https://leetcode.cn/problems/ti-huan-kong-ge-lcof/)
 *
 * @author yihonglei
 */
public class TiHuanKongGeLcof {
    public static String replaceSpace(String s) {
        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        String sNew = replaceSpace(s);
        System.out.println("sNew = " + sNew);
    }
}
