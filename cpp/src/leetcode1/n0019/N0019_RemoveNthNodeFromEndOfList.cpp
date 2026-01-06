//
// Created by yihonglei on 2025/12/25.
//
/**
 * [19. 删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/)
 */
class N0019_RemoveNthNodeFromEndOfList {
public:
    struct ListNode {
        int val;
        ListNode* next;
        ListNode(int val):val(val),next(nullptr){}
    };

    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        // 长度
        ListNode* cur = dummy;
        int len = 0;
        while (cur->next != nullptr) {
            len++;
            cur = cur->next;
        }
        // 计算要删除位置的前置节点位置
        cur = dummy;
        int prev = len -n;
        for (int i = 0; i < prev; i++) {
            cur = cur->next;
        }

        cur->next = cur->next->next;
        return dummy->next;
    }
};