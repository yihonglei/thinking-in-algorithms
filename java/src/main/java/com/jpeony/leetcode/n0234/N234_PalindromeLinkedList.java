package com.jpeony.leetcode.n0234;

import java.util.ArrayList;

/**
 * [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)
 * [234. 回文链表](https://leetcode.cn/problems/palindrome-linked-list/)
 *
 * @author yihonglei
 */
public class N234_PalindromeLinkedList {

    /**
     * 复制链表元素到数组
     */
    public static boolean isPalindromeTwoPoint(ListNode head) {
        if (head == null) {
            return true;
        }
        // 复制链表元素到集合
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        // 双指针左右同时遍历比较元素是否相等
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int lv = list.get(left);
            int rv = list.get(right);
            // 对应位置元素不相等，不是回文链表
            if (lv != rv) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeFastSlowPoint(ListNode head) {
        if (head == null) {
            return true;
        }
        // 查找中间结点
        ListNode midNode = middle(head);
        // 后半部分链表反转
        ListNode secondHead = reverse(midNode.next);
        // 比较链表前半部分和反转后的后半部分对应位置元素是否相等，相等是回文链表，否则不是
        ListNode first = head;
        ListNode second = secondHead;
        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    /**
     * 原地反转
     */
    private static ListNode reverse(ListNode head) {
        ListNode res = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = res;
            res = cur;
            cur = temp;
        }
        return res;
    }

    /**
     * 快慢指针查找链表中间结点
     */
    private static ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            // 慢指针走一步
            slow = slow.next;
            // 快指针走两步
            fast = fast.next.next;
        }
        return slow;
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

    private static void printAll(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(2);
        ListNode tail = new ListNode(1);

        root.next = one;
        one.next = two;
        two.next = tail;

        boolean palindrome = isPalindromeFastSlowPoint(root);
        System.out.println("isPalindrome = " + palindrome);
        printAll(root);
    }
}
