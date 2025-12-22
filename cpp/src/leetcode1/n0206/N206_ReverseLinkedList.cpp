//
// Created by yihonglei on 2025/12/22.
//

class N206_ReverseLinkedList {
public:
    struct ListNode {
        int val;
        ListNode *next;
        ListNode():val(0),next(nullptr){}
        ListNode(int x):val(x),next(nullptr){}
        ListNode(int x, ListNode *next) : val(x), next(next) {}
    };

    ListNode* reverseList(ListNode* head) {
        ListNode* res = nullptr;
        ListNode* cur = head;
        while (cur != nullptr) {
            ListNode* temp = cur->next;
            cur->next = res;
            res = cur;
            cur = temp;
        }
        return res;
    }
};