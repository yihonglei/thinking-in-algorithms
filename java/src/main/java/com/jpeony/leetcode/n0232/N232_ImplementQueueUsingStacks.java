package com.jpeony.leetcode.n0232;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/)
 *
 * @author yihonglei
 */
public class N232_ImplementQueueUsingStacks {

    /**
     * 负责入队
     */
    Deque<Integer> in = new ArrayDeque<Integer>();
    /**
     * 负责出队
     */
    Deque<Integer> out = new ArrayDeque<Integer>();

    public N232_ImplementQueueUsingStacks() {

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        if (in.isEmpty() && out.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        N232_ImplementQueueUsingStacks queue = new N232_ImplementQueueUsingStacks();

        queue.push(1);
        queue.push(2);
        queue.pop();
        queue.push(3);
        queue.push(4);

        int pop = queue.pop();
        System.out.println("pop = " + pop);

        int peek = queue.peek();
        System.out.println("peek = " + peek);

        boolean empty = queue.empty();
        System.out.println("empty = " + empty);
    }
}
