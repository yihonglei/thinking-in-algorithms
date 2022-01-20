# [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

## 题目

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

Example 2:
```
Input: head = [1], n = 1
Output: []
```

Example 3:
```
Input: head = [1,2], n = 1
Output: [1]
```

Constraints:
- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

***Follow up:*** Could you do this in one pass?

## 题目含义

删除链表的倒数第 n 个节点，并返回删除后链表头的结点。

## 算法思路

1、计算链表长度；

2、计算链表删除元素上一个节点位置；

3、找到删除元素上一个元素节点 pre，通过 pre.next = pre.next.next 即可删除链表节点；

## 复杂度分析

时间复杂度：O(n)。n 为链表长度。

空间复杂度：O(1)。不需要额外渐进增长空间。