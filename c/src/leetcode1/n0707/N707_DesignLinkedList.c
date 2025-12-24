//
// Created by yihonglei on 2025/12/13.
//

/**
 * [707. 设计链表](https://leetcode.cn/problems/design-linked-list/)
 */
#define MAX(a, b) ((a) > (b) ? (a) : (b))

typedef struct {
    struct ListNode *head;
    int size;
} MyLinkedList;

struct ListNode *ListNodeCreate(int val) {
    struct ListNode *node = (struct ListNode *) malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

MyLinkedList *myLinkedListCreate() {
    MyLinkedList *obj = (MyLinkedList *) malloc(sizeof(MyLinkedList));
    obj->head = ListNodeCreate(0);
    obj->size = 0;
    return obj;
}

int myLinkedListGet(MyLinkedList *obj, int index) {
    if (index < 0 || index >= obj->size) {
        return -1;
    }
    struct ListNode *cur = obj->head;
    for (int i = 0; i <= index; i++) {
        cur = cur->next;
    }
    return cur->val;
}

void myLinkedListAddAtIndex(MyLinkedList *obj, int index, int val) {
    if (index > obj->size) {
        return;
    }
    index = MAX(0, index);
    obj->size++;
    struct ListNode *pred = obj->head;
    for (int i = 0; i < index; i++) {
        pred = pred->next;
    }

    struct ListNode *toAdd = ListNodeCreate(val);
    toAdd->next = pred->next;
    pred->next = toAdd;
}

void myLinkedListAddAtHead(MyLinkedList *obj, int val) {
    myLinkedListAddAtIndex(obj, 0, val);
}

void myLinkedListAddAtTail(MyLinkedList *obj, int val) {
    myLinkedListAddAtIndex(obj, obj->size, val);
}

void myLinkedListDeleteAtIndex(MyLinkedList *obj, int index) {
    if (index < 0 || index >= obj->size) {
        return;
    }
    obj->size--;
    struct ListNode *pred = obj->head;
    for (int i = 0; i < index; i++) {
        pred = pred->next;
    }
    struct ListNode *p = pred->next;
    pred->next = pred->next->next;
    free(p);
}

void myLinkedListFree(MyLinkedList *obj) {
    struct ListNode *cur = NULL, *tmp = NULL;
    for (cur = obj->head; cur;) {
        tmp = cur;
        cur = cur->next;
        free(tmp);
    }
    free(obj);
}


