package com.jpeony.leetcode3.n2095;

/**
 * [2095. 删除链表的中间节点](https://leetcode.cn/problems/delete-the-middle-node-of-a-linked-list)
 */
public class N2095_DeleteTheMiddleNodeOfALinkedList {

    public static ListNode deleteMiddle(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        if (len <= 1) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        int mid = len / 2; // 中间位置
        int prevIndex = mid - 1; // 中间位置的前一个位置
        for (int i = 0; i < mid; i++) {
            prev = prev.next;
            if (i == prevIndex) {
                prev.next = prev.next.next;
            }
        }

        return dummy.next;
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


    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode tail = new ListNode(4);

        root.next = one;
        one.next = two;
        two.next = tail;

        deleteMiddle(root);
    }

}
