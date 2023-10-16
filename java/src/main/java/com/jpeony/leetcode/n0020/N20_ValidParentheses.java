package com.jpeony.leetcode.n0020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

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

        char[] cArr = s.toCharArray();

        for (char c : cArr) {
            // 栈顶元素出栈
            Character p = stack.peek();
            if (p != null) {
                // 成对的出栈
                if ((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '[' && c == ']')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        // 如果都成对，必然都出栈，返回 true，否则返回 false
        return stack.isEmpty();
    }

    public static boolean isValid2(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //碰到左括号，就把相应的右括号入栈
            if (ch == '(') {
                deque.push(')');
            }else if (ch == '{') {
                deque.push('}');
            }else if (ch == '[') {
                deque.push(']');
            } else if (deque.isEmpty() || deque.peek() != ch) {
                return false;
            }else {//如果是右括号判断是否和栈顶元素匹配
                deque.pop();
            }
        }
        //最后判断栈中元素是否匹配
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[]}";

        boolean valid = isValid2(s);

        System.out.println("isValid = " + valid);
    }
}
