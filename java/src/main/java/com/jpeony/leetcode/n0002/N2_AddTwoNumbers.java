package com.jpeony.leetcode.n0002;

/**
 * [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
 * [2. 两数相加](https://leetcode-cn.com/problems/add-two-numbers/)
 *
 * @author yihonglei
 */
public class N2_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 创建新链表，用哨兵节点（哑节点）技巧
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        // 进位数
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            // 计算当前值，构建节点到链表末尾
            int cur = sum % 10;
            tail.next = new ListNode(cur);
            tail = tail.next;

            // 计算进位
            carry = sum / 10;

            // 下一个节点的循环
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return dummy.next;
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
        ListNode head1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);

        head1.next = node1;
        node1.next = node2;

        ListNode head2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);

        head2.next = node3;
        node3.next = node4;

        ListNode newHead = addTwoNumbers(head1, head2);
        printAll(newHead);
    }
}
