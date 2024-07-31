package com.jpeony.leetcode1.n0160;

import com.jpeony.common.ListNode;

import java.util.ArrayList;

/**
 * [160. 相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists)
 */
public class N160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        // 计算链表长度
        int lenA = 0;
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        int lenB = 0;
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }
        // 计算差值
        int gap = Math.abs(lenA - lenB);
        curA = headA;
        curB = headB;
        if (lenA > lenB) {
            for (int i = 1; i <= gap; i++) {
                curA = curA.next;
            }
        } else {
            for (int i = 1; i <= gap; i++) {
                curB = curB.next;
            }
        }
        // 计算交点
        while (curA != null && curB != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }

        return null;
    }

    public static void main(String[] args) {
        String binary = Integer.toBinaryString(42);
        System.out.println(binary);
    }
}
