package com.jpeony.leetcode1.n0258;

public class N258_AddDigits {

    public static int addDigits1(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;
    }


    // 方法2：递归
    public static int addDigits2(int num) {
        if (num < 10) {
            return num;
        }
        return r(num);
    }

    public static int r(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        num = sum;
        return r(num);
    }

    public static void main(String[] args) {
        int result = addDigits1(38);
        System.out.println(result);
    }
}
