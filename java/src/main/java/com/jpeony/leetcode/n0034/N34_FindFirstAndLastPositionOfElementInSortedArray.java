package com.jpeony.leetcode.n0034;

/**
 * [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/)
 * [9. 回文数](https://leetcode-cn.com/problems/palindrome-number/)
 *
 * @author yihonglei
 */
public class N9_PalindromeNumber {

    /**
     * 【整数反转比较】
     * 整数反转算法：https://jpeony.blog.csdn.net/article/details/122524582
     */
    private static boolean isPalindromeRev(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        long rev = 0;
        int cur = x;
        while (cur != 0) {
            int tmp = cur % 10;
            rev = rev * 10 + tmp;
            cur = cur / 10;
        }

        if (rev > Integer.MAX_VALUE) {
            return false;
        }

        return x == rev;
    }

    /**
     * 【双指针】
     * 时间复杂度：O(logn)。每次迭代都可能退出循环。
     * 空间复杂度：O(1)。只需要临时变量，不需要其他额外的渐进增长空间，所以空间复杂度是 O(1)。
     */
    private static boolean isPalindromeTwoPointer(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }
        // 转换为字符数组
        String xStr = x + "";
        char[] c = xStr.toCharArray();

        // 回文比较
        int leftPoint = 0, rightPoint = c.length - 1;
        while (leftPoint < rightPoint) {
            int left = c[leftPoint];
            int right = c[rightPoint];
            if (left != right) {
                return false;
            }

            leftPoint++;
            rightPoint--;
        }

        return true;
    }


    public static void main(String[] args) {
        int x = 123;
        // 整数反转比较
        // System.out.println("isPalindromeRev = " + isPalindromeRev(x));
        // 双指针
        System.out.println("isPalindromeTwoPointer = " + isPalindromeTwoPointer(x));
    }
}
