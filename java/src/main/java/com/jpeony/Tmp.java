package com.jpeony;

import java.util.ArrayDeque;

public class Tmp {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque.size());
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque.size());
        deque.removeFirst();
        deque.add(4);
        System.out.println(deque.size());
    }
}
