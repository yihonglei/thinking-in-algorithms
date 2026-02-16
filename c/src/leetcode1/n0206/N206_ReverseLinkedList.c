//
// Created by yihonglei on 2025/12/22.
//
#include <stdlib.h>
#include <stdio.h>

struct ListNode {
    int val;
    struct ListNode *next;
} ListNode;

struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* res = NULL;
    struct ListNode* cur = head;
    while (cur != NULL) {
        struct ListNode* temp = cur->next;
        cur->next = res;
        res = cur;
        cur = temp;
    }
    return res;
}