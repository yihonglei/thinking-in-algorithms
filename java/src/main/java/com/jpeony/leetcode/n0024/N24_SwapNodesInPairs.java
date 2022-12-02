package com.jpeony.leetcode.n0024;

/**
 * [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)
 * [24. 两两交换链表中的结点](https://leetcode.cn/problems/swap-nodes-in-pairs/)
 *
 * @author yihonglei
 */
public class N24_SwapNodesInPairs {

    /**
     * 【迭代】
     * 时间复杂度：O(n)。n 为链表结点个数，对每个结点都需要迭代操作。
     * 空间复杂度：O(1)。哨兵结点链表定义之后固定，在算法执行过程中不需要额外渐进增长空间。
     */
    private static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode one = prev.next;
            ListNode two = prev.next.next;

            // 结点交换
            prev.next = two;
            one.next = two.next;
            two.next = one;

            prev = one; // 往前移动一步
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
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode tail = new ListNode(4);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;

        printAll(head);

        ListNode afterHead = swapPairs(head);

        printAll(afterHead);
    }
}
