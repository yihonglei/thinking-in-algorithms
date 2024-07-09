package com.jpeony.leetcode1.n0008;

/**
 * [8. String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/)
 * [8. 字符串转换整数 (atoi)](https://leetcode.cn/problems/string-to-integer-atoi/)
 *
 * @author yihonglei
 */
public class N8_StringToIntegerAtoi {
    /**
     * 多一点耐心，多一点细心，多一点包容
     */
    public static int myAtoi(String s) {
        int len = s.length();
        // 转换为数组
        char[] cArr = s.toCharArray();
        // 1、去掉前导空格
        int index = 0;
        while (index < len && cArr[index] == ' ') {
            index++;
        }
        // 2、整个字符串都是空格特殊情况
        if (index == len) {
            return 0;
        }
        // 3、符号位
        int flag = 1;
        char firstChar = cArr[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            flag = -1;
        }
        // 4、将后续出现的数字字符进行转换
        int res = 0;
        while (index < len) {
            char currChar = cArr[index];
            // 4.1 先判断不合法的情况
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 4.2 合法的情况下，才考虑转换，每一步都把符号位乘进去
            res = res * 10 + flag * (currChar - '0');
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "42";
        int myAtoi = myAtoi(s);
        System.out.println("myAtoi = " + myAtoi);
    }
}
