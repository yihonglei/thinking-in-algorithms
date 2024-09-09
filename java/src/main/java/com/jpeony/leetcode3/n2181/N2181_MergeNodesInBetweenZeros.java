package com.jpeony.leetcode3.n2181;

import com.jpeony.common.ListNode;

/**
 * [2181. 合并零之间的节点](https://leetcode.cn/problems/merge-nodes-in-between-zeros)
 */
public class N2181_MergeNodesInBetweenZeros {
    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        ListNode cur = head.next;
        int sum = 0;
        while (cur != null) {
            sum += cur.val;
            if (cur.val == 0) {
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            cur = cur.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(0);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(0);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        mergeNodes(head);
    }
}
