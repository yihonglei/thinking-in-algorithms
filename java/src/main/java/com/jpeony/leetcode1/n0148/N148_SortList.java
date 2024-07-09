package com.jpeony.leetcode1.n0148;

import java.util.ArrayList;
import java.util.Collections;

/**
 * [148. Sort List](https://leetcode.com/problems/sort-list/)
 * [148. 排序链表](https://leetcode.cn/problems/sort-list/)
 *
 * @author yihonglei
 */
public class N148_SortList {

    /**
     * 瞎闹版本
     */
    public static ListNode sortListSimple(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for (Integer i : list) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }

        return dummy.next;
    }

    /**
     * 【自顶向下归并排序】
     * 时间复杂度：O(nlogn)。n 是链表的长度。
     * 空间复杂度：O(logn)。n 是链表的长度。空间复杂度主要取决于递归调用的栈空间。
     */
    public static ListNode sortListUD(ListNode head) {
        return sortListUD(head, null);
    }

    /**
     * 分：切割为子链表
     */
    public static ListNode sortListUD(ListNode head, ListNode tail) {
        // 递归终止条件
        if (head == null) {
            return head;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }

        // 计算中间结点，用于子链表
        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }

        ListNode mid = slow;
        ListNode list1 = sortListUD(head, mid);
        ListNode list2 = sortListUD(mid, tail);
        ListNode sorted = mergeUD(list1, list2);
        return sorted;
    }

    /**
     * 治：子链表排序合并
     */
    public static ListNode mergeUD(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        // 两个子链表合并
        ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
        while (temp1 != null && temp1 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        // 剩余子链表合并，防止偶数链表长度不一致出现剩余比对结点
        if (temp1 != null) {
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }

        return dummyHead.next;
    }

    /**
     * 【自底向上归并排序】
     * 时间复杂度： O(nlogn)。n 是链表的长度。
     * 空间复杂度：O(1)。
     */
    public static ListNode sortListDU(ListNode head) {
        if (head == null) {
            return head;
        }
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        ListNode dummyHead = new ListNode(0, head);
        for (int subLength = 1; subLength < length; subLength <<= 1) {
            ListNode prev = dummyHead, curr = dummyHead.next;
            while (curr != null) {
                ListNode head1 = curr;
                for (int i = 1; i < subLength && curr.next != null; i++) {
                    curr = curr.next;
                }
                ListNode head2 = curr.next;
                curr.next = null;
                curr = head2;
                for (int i = 1; i < subLength && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }
                ListNode next = null;
                if (curr != null) {
                    next = curr.next;
                    curr.next = null;
                }
                ListNode merged = mergeDU(head1, head2);
                prev.next = merged;
                while (prev.next != null) {
                    prev = prev.next;
                }
                curr = next;
            }
        }
        return dummyHead.next;
    }

    public static ListNode mergeDU(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }
        return dummyHead.next;
    }

    private static void printAll(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
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
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode tail = new ListNode(3);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;

        printAll(head);
        ListNode sortList = sortListUD(head);
        printAll(sortList);
    }
}
