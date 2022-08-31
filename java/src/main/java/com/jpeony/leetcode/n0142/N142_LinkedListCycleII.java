package com.jpeony.leetcode.n0142;

import java.util.HashSet;
import java.util.Set;

/**
 * [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)
 * [142. 环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/)
 *
 * @author yihonglei
 */
public class N142_LinkedListCycleII {

    /**
     * 【哈希表】
     * 时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。
     * 空间复杂度：O(n)。n 为链表长度，哈希表需要额外存储 n 个节点空间，所以渐进增长空间复杂度为 O(n)。
     */
    private static ListNode detectCycleHash(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            }
            visited.add(pos);
            pos = pos.next;
        }
        return null;
    }

    /**
     * 【快慢指针】
     * 时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。只有固定的临时指针变量，不会随着算法执行需要额外的渐进增长空间。
     */
    private static ListNode detectCyclePoint(ListNode head) {
        // 链表为空，直接返回 null
        if (head == null) {
            return null;
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
                // 指向 fast 节点指针，相遇点
                ListNode one = fast;
                // 指向 head 节点指针
                ListNode two = head;
                // 两个指针，从头结点和相遇结点，各走一步，直到相遇，即为环形节点入口
                while (one != two) {
                    one = one.next;
                    two = two.next;
                }
                return one;
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

        ListNode cycleHeadHash = detectCycleHash(head);
        System.out.println("哈希表 = " + cycleHeadHash.val);

        ListNode cycleHeadPoint = detectCyclePoint(head);
        System.out.println("快慢指针 = " + cycleHeadPoint.val);
    }
}
