package com.jpeony.leetcode.n0083;

/**
 * [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 * [83. 删除排序链表中的重复元素](https://leetcode.cn.com/problems/remove-duplicates-from-sorted-list/)
 *
 * @author yihonglei
 */
public class N83_RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode cur = head;

        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
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
        while (head != null) {
            System.out.println(" " + head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode tail = new ListNode(2);

        head.next = node1;
        node1.next = tail;

        ListNode listNode = deleteDuplicates(head);
        printAll(listNode);
    }
}
