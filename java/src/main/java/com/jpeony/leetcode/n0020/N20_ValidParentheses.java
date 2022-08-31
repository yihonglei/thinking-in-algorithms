package com.jpeony.leetcode.n0020;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
 * [20. 有效的括号](https://leetcode.cn/problems/valid-parentheses/)
 *
 * @author yihonglei
 */
public class N20_ValidParentheses {

    /**
     * 【栈】
     * 时间复杂度：O(n)。n 为字符串字符个数。
     * 空间复杂度：O(n)。n 为字符串字符个数。
     */
    private static boolean isValid(String s) {
        // 栈声明，不要用 Stack，它是 synchronized 同步的，每次操作影响性能。
        Deque<Character> stack = new ArrayDeque<Character>();

        // 字符串转换为数组
        char[] cArr = s.toCharArray();

        for (char c : cArr) {
            // 栈顶元素出栈
            Character p = stack.peek();
            // 第一次循环 p 是空的
            if (p != null) {
                // 成对的出栈
                if ((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '[' && c == ']')) {
                    stack.pop();
                } else {
                    // 不符合条件的入栈
                    stack.push(c);
                }
            } else {
                // 第一个元素入栈
                stack.push(c);
            }
        }

        // 如果都成对，必然都出栈，返回 true，否则返回 false
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[)";

        boolean valid = isValid(s);

        System.out.println("isValid = " + valid);
    }
}
