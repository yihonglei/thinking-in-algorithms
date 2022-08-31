package com.jpeony.interview;

/**
 * [面试题 02.08. 环路检测](https://leetcode.cn/problems/linked-list-cycle-lcci/)
 *
 * @author yihonglei
 */
public class LinkedListCycleLcci {

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

    /**
     * 链表节点
     */
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode tail = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;
        // 形成环形链表
        tail.next = node1;

        ListNode cycle = detectCycle(head);
        System.out.println("detectCycle = " + cycle);
    }
}
