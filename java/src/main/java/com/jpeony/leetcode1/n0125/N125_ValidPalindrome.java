package com.jpeony.leetcode1.n0125;

/**
 * [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome)
 */
public class N125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        String sn = sb.toString();
        int left = 0;
        int right = sn.length() - 1;
        while (left <= right) {
            if (!String.valueOf(sn.charAt(left)).equalsIgnoreCase(String.valueOf(sn.charAt(right)))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println("palindrome = " + palindrome);
    }
}
