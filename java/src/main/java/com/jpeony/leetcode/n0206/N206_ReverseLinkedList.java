package com.jpeony.leetcode.n0206;

/**
 * [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
 * [206. 反转链表](https://leetcode.cn/problems/reverse-linked-list/)
 *
 * @author yihonglei
 */
public class N206_ReverseLinkedList {

    /**
     * 【链表原地反转】
     * 时间复杂度：O(n)。n 为链表长度，迭代次数，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。链表原地操作，只需要一个临时变量空间，所以空间复杂度为 O(1)。
     */
    private static ListNode reverseList(ListNode head) {
        ListNode res = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTmp = cur.next;
            cur.next = res;
            res = cur;
            cur = nextTmp;
        }
        return res;
    }

    /**
     * Definition for singly-linked list.
     */
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
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
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        printAll(head);
        ListNode afterHead = reverseList(head);
        printAll(afterHead);
    }
}
