package com.jpeony.leetcode.n0344;

import java.util.Arrays;

/**
 * [344. Reverse String](https://leetcode.com/problems/reverse-string/)
 * [344. 反转字符串](https://leetcode.cn.com/problems/reverse-string/)
 *
 * @author yihonglei
 */
public class N344_ReverseString {
    /**
     * 【双指针】
     * 时间复杂度：O(n)。n 为字符数组长度。
     * 空间复杂度：O(1)。左右指针临时变量，不需要额外渐进增长空间。
     */
    private static void reverseString(char[] s) {
        int leftPoint = 0, rightPoint = s.length - 1;
        while (leftPoint < rightPoint) {
            char temp = s[leftPoint];
            s[leftPoint] = s[rightPoint];
            s[rightPoint] = temp;

            leftPoint++;
            rightPoint--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println("reverseBefore = " + Arrays.toString(s));

        // reverse string function
        reverseString(s);

        System.out.println("reverseAfter = " + Arrays.toString(s));
    }
}
