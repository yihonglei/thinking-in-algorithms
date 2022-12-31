package com.jpeony.leetcode.n0019;

/**
 * [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 * [19. 删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/)
 *
 * @author yihonglei
 */
public class N19_RemoveNthNodeFromEndOfList {

    /**
     * 【计算链表长度】
     * 时间复杂度：O(n)。n 为链表长度。
     * 空间复杂度：O(1)。不需要额外渐进增长空间。
     */
//    private static ListNode removeNthFromEnd(ListNode head, int n) {
//        // 计算链表长度
//        int len = 0;
//        ListNode lenTemp = head;
//        while (lenTemp != null) {
//            len++;
//            lenTemp = lenTemp.next;
//        }
//        // 构建哨兵结点链表
//        ListNode dummy = new ListNode(-1, head);
//        // 计算要删除结点的上一个结点所在位置
//        int preN = len - n + 1; // 需要考虑哨兵结点
//        // 移出元素位置的上一个结点
//        ListNode pre = dummy;
//        for (int i = 1; i < preN; i++) {
//            pre = pre.next;
//        }
//        // 移出元素位置的上一个结点的下一个结点，等于移出元素位置的上一个结点的下下一个结点，把移出元素位置结点删除
//        pre.next = pre.next.next;
//
//        return dummy.next;
//    }

    /**
     * 【双指针】
     */
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // 只要快慢指针相差 n 个结点即可
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow 为待删除结点的上一个结点
        slow.next = slow.next.next;

        return dummy.next;
    }

    /**
     * 链表结点
     */
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

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
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode tail = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = tail;

        printAll(head);

        ListNode afterHead = removeNthFromEnd(head, 2);

        printAll(afterHead);
    }
}
