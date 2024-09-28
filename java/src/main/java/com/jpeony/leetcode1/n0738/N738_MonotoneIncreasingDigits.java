package com.jpeony.leetcode1.n0738;

/**
 * [738. 单调递增的数字](https://leetcode.cn/problems/monotone-increasing-digits)
 */
public class N738_MonotoneIncreasingDigits {
    public static int monotoneIncreasingDigits(int N) {
        String[] strings = (N + "").split("");
        int start = strings.length;
        for (int i = strings.length - 1; i > 0; i--) {
            if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i - 1])) {
                strings[i - 1] = (Integer.parseInt(strings[i - 1]) - 1) + "";
                start = i;
            }
        }
        for (int i = start; i < strings.length; i++) {
            strings[i] = "9";
        }
        return Integer.parseInt(String.join("", strings));
    }

    public static void main(String[] args) {
        int i = monotoneIncreasingDigits(332);
        System.out.println("i = " + i);
    }
}
