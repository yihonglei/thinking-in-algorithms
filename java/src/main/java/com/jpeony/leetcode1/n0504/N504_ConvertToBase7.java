package com.jpeony.leetcode1.n0504;

/**
 * [504. 七进制数](https://leetcode.cn/problems/base-7)
 */
public class N504_ConvertToBase7 {
    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean flag = num > 0;// true 为正数, false 为负数
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (!flag) {
            sb.append("-");
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 100;
        String ans = convertToBase7(num);
        System.out.println("ans=" + ans);
    }
}
