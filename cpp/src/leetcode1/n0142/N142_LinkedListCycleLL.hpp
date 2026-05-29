//
// Created by yihonglei on 2026/3/6.
//

#ifndef CPP_N142_LINKEDLISTCYCLELL_HPP
#define CPP_N142_LINKEDLISTCYCLELL_HPP


class N142_LinkedListCycleLL {
public:
    struct ListNode {
        int val;
        ListNode* next;
        ListNode(int val):val(val),next(nullptr){}
    };

    ListNode *detectCycle(ListNode *head);
};


#endif //CPP_N142_LINKEDLISTCYCLELL_HPP
