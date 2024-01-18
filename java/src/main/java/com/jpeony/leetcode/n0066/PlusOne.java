package com.jpeony.leetcode.n0066;

import java.util.Arrays;

/**
 * [66. 加一](https://leetcode.cn/problems/plus-one/description/)
 *
 * @author yihonglei
 */
public class PlusOne {

    /**
     * case1：如果全部是9，结果为 1,0,0....
     * case2：如果最后一个不是9，结果为最后一个加 1
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                // 易读写法
                digits[i] = digits[i] + 1; // 简洁写法 digits[i]++
                return digits;
            }
            digits[i] = 0;
        }
        // 跳出for循环，说明数字全部是 9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }
}
