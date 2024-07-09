package com.jpeony.leetcode1.n0344;

import java.util.Arrays;

/**
 * [344. Reverse String](https://leetcode.com/problems/reverse-string/)
 * [344. 反转字符串](https://leetcode.cn/problems/reverse-string/)
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
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
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
