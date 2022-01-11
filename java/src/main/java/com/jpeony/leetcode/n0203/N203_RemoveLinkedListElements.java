package com.jpeony.leetcode.n0203;

/**
 * [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)
 * [203. 移除链表元素](https://leetcode-cn.com/problems/remove-linked-list-elements/)
 *
 * @author yihonglei
 */
public class N203_RemoveLinkedListElements {

    /**
     * 【暴力求解】
     * 时间复杂度：O(n)。链表遍历次数，n 为链表长度，所以时间复杂度为 O(n)。
     * 空间复杂度：O(n)。n 为新链表元素的个数。
     */
    private static ListNode removeElementsOne(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head != null) {
            if (head.val != val) {
                tail = tail.next = new ListNode(head.val);
            }
            head = head.next;
        }

        return dummy.next;
    }

    /**
     * 【迭代】
     * 时间复杂度：O(n)。链表遍历次数，n 为链表长度，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。固定链表上操作，不需要额外渐进增长空间。
     */
    private static ListNode removeElementsTwo(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }

        return dummy.next;
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
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for (int i = 1; i < nums.length; i++) {
            tail = tail.next = new ListNode(nums[i]);
        }
        printAll(head);

        // 移出链表中重复元素
        int target = 6;
        // ListNode afterHead = removeElementsOne(head, target);

        ListNode afterHead = removeElementsTwo(head, target);

        printAll(afterHead);
    }
}
