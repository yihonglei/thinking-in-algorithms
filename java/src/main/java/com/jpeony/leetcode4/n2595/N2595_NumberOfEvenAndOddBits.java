package com.jpeony.leetcode4.n2595;

import java.util.Arrays;

public class N2595_NumberOfEvenAndOddBits {

    public static int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        String s = Integer.toBinaryString(n);
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '1') {
                if (((s.length() - i) + 1) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        int[] ints = evenOddBit(50);
        System.out.println(Arrays.toString(ints));
    }
}
