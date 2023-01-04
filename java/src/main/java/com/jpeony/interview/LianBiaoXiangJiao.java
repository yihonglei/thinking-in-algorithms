package com.jpeony.interview;

/**
 * @author yihonglei
 */
public class LianBiaoXiangJiao {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode A = headA, B = headB;
//        while (A != B) {
//            A = A != null ? A.next : headB;
//            B = B != null ? B.next : headA;
//        }
//        return A;

        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        // 计算链表 A 的长度
        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        // 计算链表 B 的长度
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;
        // 计算长链表和短链表，以及对应的长度
        ListNode longHead = null, shortHead = null;
        int longLen = 0, shortLen = 0;
        if (lenB > lenA) {
            // 长链表
            longHead = curB;
            longLen = lenB;
            // 短链表
            shortHead = curA;
            shortLen = lenA;
        } else {
            // 长链表
            longHead = curA;
            longLen = lenA;
            // 短链表
            shortHead = curB;
            shortLen = lenB;
        }

        // 求长链表和短链表元素个数之差
        int gap = longLen - shortLen;
        // 让长链表和短链表在同一起点上（末尾位置对齐）
        while (gap-- > 0) {
            longHead = longHead.next;
        }

        // 遍历 longHead 和 shortHead，遇到相同则直接返回
        while (longHead != null) {
            if (longHead == shortHead) {
                return longHead;
            }
            longHead = longHead.next;
            shortHead = shortHead.next;
        }
        // 未找到相交结点，返回 null
        return null;
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

    public static void main(String[] args) {

    }
}
