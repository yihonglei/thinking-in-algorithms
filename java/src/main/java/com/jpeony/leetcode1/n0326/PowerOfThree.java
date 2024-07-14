package com.jpeony.leetcode1.n0326;

/**
 * [326. 3 的幂](https://leetcode.cn/problems/power-of-three/description/)
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        long result = r(1, n);
        return result == n;
    }

    public static long r(long s, int n) {
        if (s >= n) {
            return s;
        }
        s = s * 3;
        return r(s, n);
    }

    public static void main(String[] args) {
        boolean b = isPowerOfThree(27);
        System.out.println("b = " + b);
    }
}
