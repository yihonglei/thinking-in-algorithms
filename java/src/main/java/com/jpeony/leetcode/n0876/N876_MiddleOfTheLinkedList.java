package com.jpeony.leetcode.n0876;

/**
 * [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
 * [876. 链表的中间结点](https://leetcode.cn/problems/middle-of-the-linked-list/)
 *
 * @author yihonglei
 */
public class N876_MiddleOfTheLinkedList {

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next != null) {
            return slow.next;
        }

        return slow;
    }

    /**
     * 链表结点
     */
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
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
        ListNode root = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(2);
        ListNode tail = new ListNode(1);

        root.next = one;
        one.next = two;
        two.next = tail;

        ListNode middleNode = middleNode(root);
        printAll(middleNode);
    }
}
