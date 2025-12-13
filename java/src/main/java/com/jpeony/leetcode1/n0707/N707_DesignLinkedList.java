package com.jpeony.leetcode1.n0707;

/**
 * [707. Design Linked List](https://leetcode.com/problems/design-linked-list/)
 * [707. 设计链表](https://leetcode.cn/problems/design-linked-list/)
 *
 * @author yihonglei
 */
public class N707_DesignLinkedList {
    /**
     * 哨兵结点
     */
    private Node dummyHead;
    /**
     * 链表元素个数
     */
    private int size;

    public N707_DesignLinkedList() {
        this.size = 0;
        this.dummyHead = new Node(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node cur = dummyHead;
        // cur = cur.next 操作是跳过哨兵结点，真正操作链表元素
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }

        return cur.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node cur = dummyHead;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        Node cur = dummyHead;
        // 寻找要添加元素的上一个节点
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        // 构建新结点，插入指定位置，链表衔接操作
        Node newNode = new Node(val);
        newNode.next = cur.next;
        cur.next = newNode;

        // 链表元素计数加 1
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        // 寻找删除位置的上一个结点位置
        Node cur = dummyHead;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        // 删除当前结点
        cur.next = cur.next.next;
        // 链表元素计数减 1
        size--;
    }

    /**
     * Definition for singly-linked list.
     */
    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private static void printAll(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        N707_DesignLinkedList obj = new N707_DesignLinkedList();

        printAll(obj.dummyHead);
        obj.addAtHead(1);

        printAll(obj.dummyHead);
        obj.addAtTail(2);

        printAll(obj.dummyHead);
        obj.addAtIndex(2, 3);

        printAll(obj.dummyHead);
        int i = obj.get(0);
        System.out.println("i = " + i);

        printAll(obj.dummyHead);
        obj.deleteAtIndex(1);
    }
}
