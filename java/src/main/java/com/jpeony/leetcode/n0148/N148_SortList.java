package com.jpeony.leetcode.n0148;

import java.util.HashSet;
import java.util.Set;

/**
 * [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
 * [141. 环形链表](https://leetcode-cn.com/problems/linked-list-cycle/)
 *
 * @author yihonglei
 */
public class N148_LinkedListCycle {

    /**
     * 【哈希表】
     * 时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。
     * 空间复杂度：O(n)。n 为链表长度，哈希表需要额外存储 n 个节点空间，所以渐进增长空间复杂度为 O(n)。
     */
    private static boolean hasCycleHash(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return true;
            }
            visited.add(pos);
            pos = pos.next;
        }
        return false;
    }

    /**
     * 【快慢指针】
     * 时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。只有固定的临时指针变量，不会随着算法执行需要额外的渐进增长空间。
     */
    private static boolean hasCyclePoint(ListNode head) {
        // 链表为空，直接返回 null
        if (head == null) {
            return false;
        }
        // 快慢指针声明，都指向链表头结点
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            // 慢指针一次走 1 步
            slow = slow.next;
            // 快指针一次走 2 步
            fast = fast.next.next;
            // 当快慢指针相遇时，必然是环形链表
            if (slow == fast) {
                return true;
            }
        }

        return false;
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

        boolean cycleHash = hasCycleHash(head);
        System.out.println("哈希表 = " + cycleHash);

        boolean cyclePoint = hasCyclePoint(head);
        System.out.println("快慢指针 = " + cyclePoint);
    }
}
