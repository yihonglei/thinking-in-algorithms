package com.jpeony.base.stack;

/**
 * 【顺序栈】基于数组实现存储int类型的栈
 *
 * @author yihonglei
 */
public class ArrayStack {
    int[] elements;
    private int size;
    private int capacity;

    public ArrayStack(int capacity) {
        elements = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    /**
     * 入栈：在数组的末端（栈顶）添加一个元素
     */
    public void push(int element) {
        if (size == capacity) {
            return;
        }
        elements[size++] = element;
    }

    /**
     * 出栈：在数组的末端（栈顶）取出一个元素
     */
    public int pop() {
        if (size == 0) {
            return 0;
        }
        int tmp = elements[size - 1];
        --size;
        return tmp;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        // 创建一个栈
        ArrayStack arrayStack = new ArrayStack(10);

        // 往栈顶添加元素
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        // 取出栈顶元素
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}
