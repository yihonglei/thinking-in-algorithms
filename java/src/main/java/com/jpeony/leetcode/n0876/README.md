# [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

## 题目

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:
```
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
```

Example 2:
```
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
```

Constraints:
- The number of nodes in the list is in the range [1, 100].
- 1 <= Node.val <= 100

## 题目含义

查找链表的中间节点，如果有两个中间节点，返回第二个中间节点。

## 算法思路

【快慢指针】

1、通过快慢指针找到中间节点；

2、找到中间节点后分两种情况判断是不是最后要返回的中间节点：
- 如果 fast 的下一个节点是空，则链表是奇数个元素链表，只存在一个中间节点，即 slow 对应的节点；
- 如果 fast 的下一个节点不为空，则链表是偶数个元素链表，存在两个中间节点，slow 是第一个中间节点，slow 的下一个节点才是第二个中间节点；

## 复杂度分析

时间复杂度：O(n)。链表节点个数。

空间复杂度：O(1)。不需要额外空间。