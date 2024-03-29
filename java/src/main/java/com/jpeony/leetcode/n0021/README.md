# [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

## 题目

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

Example 2:
```
Input: list1 = [], list2 = []
Output: []
```

Example 3:
```
Input: list1 = [], list2 = [0]
Output: [0]
```

Constraints:
- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## 题目含义

合并两个升序链表，返回升序新链表；

## 算法思路

【迭代法】

1、循环链表，比较两个链表结点大小，基于小结点构建新链表结点；

2、链表剩余结点接入链表；

## 复杂度分析

时间复杂度：O(m + n)。m, n 分别为链表长度。

空间复杂度：O(n + n)。m, n 分别为链表长度。