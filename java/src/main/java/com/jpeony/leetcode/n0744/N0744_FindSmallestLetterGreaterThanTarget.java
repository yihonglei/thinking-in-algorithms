package com.jpeony.leetcode.n0744;

/**
 * [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
 * [744. 寻找比目标字母大的最小字母](https://leetcode.cn/problems/find-smallest-letter-greater-than-target/)
 *
 * @author yihonglei
 */
public class N0744_FindSmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        // 如果找不到比目标值大的，返回数组首个元素，看评论看出来的
        if (target >= letters[n - 1]) {
            return letters[0];
        }

        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return letters[low];
    }

    public static void main(String[] args) {
        char[] letters = new char[]{'a', 'b', 'c', 'e', 'f'};
        char target = 'd';
        char res = nextGreatestLetter(letters, target);
        System.out.println("res = " + res);
    }
}
