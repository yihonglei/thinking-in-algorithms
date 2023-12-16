package com.jpeony.base.recursion;

/**
 * 最简单的递归函数
 */
public class RecursionSimple {
    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n-1) + 1;
    }

    public static void main(String[] args) {
        int f = f(2);
        System.out.println("f = " + f);
    }
}
