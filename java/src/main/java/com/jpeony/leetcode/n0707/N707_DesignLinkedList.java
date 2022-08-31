package com.jpeony.leetcode.n0707;

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
    private ListNode head;
    /**
     * 链表元素个数
     */
    private int size;

    public N707_DesignLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode cur = head;
        // cur = cur.next 操作是跳过哨兵节点，真正操作链表元素
        for (int i = 0; i < index + 1; i++) {
            cur = cur.next;
        }

        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        ListNode pre = head;
        // 寻找插入位置的上一个节点，index 不需要加 1
        for (int i = 0; i < index; ++i) {
            pre = pre.next;
        }
        // 构建新节点，插入指定位置，链表衔接操作
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;

        // 链表元素计数加 1
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        // 寻找删除位置的上一个节点位置
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        // 删除当前节点
        pre.next = pre.next.next;
        // 链表元素计数减 1
        size--;
    }

    /**
     * Definition for singly-linked list.
     */
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private static void printAll(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        N707_DesignLinkedList obj = new N707_DesignLinkedList();

        printAll(obj.head);
        obj.addAtHead(1);

        printAll(obj.head);
        obj.addAtTail(2);

        printAll(obj.head);
        obj.addAtIndex(2, 3);

        printAll(obj.head);
        int i = obj.get(0);
        System.out.println("i = " + i);

        printAll(obj.head);
        obj.deleteAtIndex(1);
    }
}
