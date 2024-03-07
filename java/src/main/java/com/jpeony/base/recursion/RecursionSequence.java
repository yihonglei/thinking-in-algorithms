package com.jpeony.base.recursion;

/**
 * 递归输出 1~10
 *
 * @author yihonglei
 */
public class RecursionSequence {
    private static int i = 0;

    private static void testRecursion01() {
        i++;
        int j = i;
        if (i <= 10) {
            System.out.println(i);
            testRecursion01();
            System.out.println("aaaaaaaaaa" + j);
        } else {
            System.out.println("Game Over!");
        }
    }

    public static void main(String[] args) {
        testRecursion01();
    }
}
