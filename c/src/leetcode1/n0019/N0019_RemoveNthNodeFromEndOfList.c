//
// Created by yihonglei on 2026/1/6.
//

typedef struct ListNode {
    int val;
    struct ListNode *next;
};

// 计算长度
struct ListNode *removeNthFromEnd(struct ListNode *head, int n) {
    struct ListNode dummy = {0, head};
    struct ListNode *cur = &dummy;
    int len = 0;
    while (cur != NULL) {
        len++;
        cur = cur->next;
    }

    cur = &dummy;
    int prev = len - 1 - n;
    for (int i = 0; i < prev; i++) {
        cur = cur->next;
    }
    cur->next = cur->next->next;
    return dummy.next;
}