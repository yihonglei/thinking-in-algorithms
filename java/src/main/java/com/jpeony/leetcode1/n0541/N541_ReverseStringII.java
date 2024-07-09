package com.jpeony.leetcode1.n0541;

/**
 * [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)
 * [541. 反转字符串 II](https://leetcode.cn/problems/reverse-string-ii/)
 *
 * @author yihonglei
 */
public class N541_ReverseStringII {
    /**
     * 【模拟+双指针】
     * 时间复杂度：O(n)。字符串长度。
     * 空间复杂度：O(1)。除了临时变量空间，剩余都是在原数组空间上操作，不需要额外的渐进增长空间。
     */
    private static String reverseStr(String s, int k) {
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < len; i += 2 * k) {
            reverse(arr, i, Math.min(i + k, len) - 1);
        }

        return new String(arr);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println("reverseBefore = " + s);

        String reverseAfter = reverseStr(s, k);

        System.out.println("reverseAfter = " + reverseAfter);
    }
}
