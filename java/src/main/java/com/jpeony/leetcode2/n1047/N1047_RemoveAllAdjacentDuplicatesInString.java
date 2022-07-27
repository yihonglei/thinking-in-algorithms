package com.jpeony.leetcode2.n1047;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [1047. Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
 * [1047. 删除字符串中的所有相邻重复项](https://leetcode.cn.com/problems/remove-all-adjacent-duplicates-in-string/)
 *
 * @author yihonglei
 */
public class N1047_RemoveAllAdjacentDuplicatesInString {

    /**
     * 【栈】
     * 时间复杂度：O(n)。n 为字符串字符个数；
     * 空间复杂度：O(n)。n 为去重后字符串字符个数。
     */
    private static String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();

        char[] arr = s.toCharArray();
        for (char c : arr) {
            Character temp = stack.peek();
            if (temp != null) {
                if (temp == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        // 栈反转
        Deque<Character> reverseStack = new ArrayDeque<Character>();
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }
        // 字符串拼接
        StringBuilder sb = new StringBuilder();
        while (!reverseStack.isEmpty()) {
            sb.append(reverseStack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "azxxzy";

        String after = removeDuplicates(s);

        System.out.println("after = " + after);
    }
}
