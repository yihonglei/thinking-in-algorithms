//
// Created by yihonglei on 2025/12/9.
//
/**
 * [707. 设计链表](https://leetcode.cn/problems/design-linked-list/)
 */
class MyLinkedList {
public:
    // 定义链表节点的结构体
    struct LinkedNode {
        int val;
        LinkedNode* next;
        LinkedNode(int val):val(val),next(nullptr) {}
    };
    // 初始化链表
    MyLinkedList() {
        // 定义头节点是一个虚拟节点，链表的哑节点写法
        _dummyHead = new LinkedNode(0);
        _size = 0;
    }
    // 获取第 index 个节点的数值，如果 index 是非法数值则直接返回-1
    // 注意 index 是从 0 开始的，第 0 个节点就是头节点，而非从哑节点开始计算
    int get(int index) {
        if (index < 0 || index >= _size) {
            return -1;
        }
        LinkedNode* cur = _dummyHead;
        for (int i = 0; i <= index; i++) {
            cur = cur->next;
        }
        return cur->val;
    }
    // 在链表最前面插入一个节点，插入完成后，新插入的节点为链表新的头节点
    void addAtHead(int val) {
        LinkedNode* newNode = new LinkedNode(val);
        newNode->next = _dummyHead->next;
        _dummyHead->next = newNode;
        _size++;
    }

    void addAtTail(int val) {
        LinkedNode* newNode = new LinkedNode(val);
        LinkedNode* cur = _dummyHead;
        while(cur->next != nullptr) {
            cur = cur->next;
        }
        cur->next = newNode;
        _size++;
    }

    void addAtIndex(int index, int val) {
        if (index < 0 || index > _size) {
            return;
        }
        LinkedNode* cur = _dummyHead;
        for (int i = 0; i < index; i++) {
            cur = cur->next;
        }
        LinkedNode* newNode = new LinkedNode(val);
        newNode->next = cur->next;
        cur->next = newNode;
        _size++;
    }

    void deleteAtIndex(int index) {
        if (index < 0 || index >= _size) {
            return;
        }
        LinkedNode* cur = _dummyHead;
        for (int i = 0; i < index; i++) {
            cur = cur->next;
        }
        LinkedNode* tmp = cur->next;
        cur->next = cur->next->next;
        delete tmp;
        _size--;
    }

private:
    int _size;
    LinkedNode* _dummyHead;
};