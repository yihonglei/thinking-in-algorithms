package com.jpeony.leetcode4.n3280;

/**
 * [3280. 将日期转换为二进制表示](https://leetcode.cn/problems/convert-date-to-binary)
 */
public class N3280_ConvertDataToBinary {
    public static String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            result.append(toBinary(num));
            if (i != arr.length - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }

    // 数字转换为二进制
    public static String toBinary(Integer num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String date = "2080-02-29";
        String s = convertDateToBinary(date);
        System.out.println("s = " + s);
    }
}
