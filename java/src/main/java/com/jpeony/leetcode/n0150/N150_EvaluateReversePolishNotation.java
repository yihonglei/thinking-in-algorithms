package com.jpeony.leetcode.n0150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 * [150. 逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation/)
 *
 * @author yihonglei
 */
public class N150_EvaluateReversePolishNotation {

    /**
     * 【栈】
     * 时间复杂度：O(n)。n 字符串数组的长度。
     * 空间复杂度：O(n)。n 为栈中元素。
     */
    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int o1 = stack.pop();
                int o2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(o2 + o1);
                        break;
                    case "-":
                        stack.push(o2 - o1);
                        break;
                    case "*":
                        stack.push(o2 * o1);
                        break;
                    case "/":
                        stack.push(o2 / o1);
                        break;
                    default:
                        // ignore
                        break;
                }
            }
        }

        return stack.pop();
    }

    private static boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }

    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};

        int rpn = evalRPN(tokens);

        System.out.println("rpn = " + rpn);
    }
}
