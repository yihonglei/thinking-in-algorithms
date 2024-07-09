package com.jpeony.leetcode1.n0225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)
 * [225. 用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/)
 *
 * @author yihonglei
 */
public class N225_ImplementStackUsingQueues {

    /**
     * 队列
     */
    Queue<Integer> queue;

    public N225_ImplementStackUsingQueues() {
        queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        // 原队列长度
        int n = queue.size();
        // 新入队元素
        queue.offer(x);
        // 将原队列元素取出重新入队
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        N225_ImplementStackUsingQueues queue = new N225_ImplementStackUsingQueues();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        int pop = queue.pop();
        System.out.println("pop = " + pop);

        int top = queue.top();
        System.out.println("top = " + top);

        boolean empty = queue.empty();
        System.out.println("empty = " + empty);
    }
}
