package com.jpeony.leetcode.n0023;

import java.util.PriorityQueue;

/**
 * [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)
 * [23. 合并K个升序链表](https://leetcode-cn.com/problems/merge-k-sorted-lists/)
 *
 * @author yihonglei
 */
public class N23_MergeKSortedLists {

    /**
     * 分治，两两链表合并
     */
    public static ListNode mergeKListsSplit(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    private static ListNode merge(ListNode[] lists, int low, int high) {
        if (low == high) {
            return lists[low];
        }

        int mid = low + (high - low) / 2;
        ListNode l1 = merge(lists, low, mid);
        ListNode l2 = merge(lists, mid + 1, high);
        return mergeTwoLists(l1, l2);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    /**
     * 优先队列
     */
    public static ListNode mergeKListsPriority(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // 优先队列（默认是小顶堆，最小值在顶部，每次出队都是最小值）
        PriorityQueue<ListNode> queue = new PriorityQueue<>((v1, v2) -> v1.val - v2.val);

        // Lists 的所有元素节点放入优先队列
        for (ListNode node : lists) {
            // 注意节点元素为空过滤掉
            if (node != null) {
                queue.add(node);
            }
        }
        // 构建链表
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!queue.isEmpty()) {
            ListNode curNode = queue.poll();
            tail.next = curNode;
            tail = tail.next;

            if (curNode.next != null) {
                queue.add(curNode.next);
            }
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
        ListNode one = new ListNode(1);
        ListNode one1 = new ListNode(4);
        ListNode one2 = new ListNode(5);
        one.next = one1;
        one1.next = one2;

        ListNode two = new ListNode(1);
        ListNode two1 = new ListNode(3);
        ListNode two2 = new ListNode(4);
        two.next = two1;
        two1.next = two2;

        ListNode three = new ListNode(2);
        ListNode three1 = new ListNode(6);
        three.next = three1;

        ListNode[] lists = new ListNode[]{one, two, three};
        ListNode newHead = mergeKListsSplit(lists);
        printAll(newHead);
    }
}
