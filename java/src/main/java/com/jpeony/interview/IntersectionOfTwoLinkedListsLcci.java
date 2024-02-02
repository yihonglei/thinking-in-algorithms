package com.jpeony.interview;

/**
 * [面试题 02.07. 链表相交](https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/)
 *
 * @author yihonglei
 */
public class IntersectionOfTwoLinkedListsLcci {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        // 计算链表长度
        int lenA = 0, lenB = 0;
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }
        // 重置指针
        curA = headA;
        curB = headB;
        // 求差
        int gap = Math.abs(lenA - lenB);
        if (lenA > lenB) {
            for (int i = 1; i <= gap; i++) {
                curA = curA.next;
            }
        } else {
            for (int i = 1; i <= gap; i++) {
                curB = curB.next;
            }
        }

        while (curA != null || curB != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }

        return null;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        
    }

}
