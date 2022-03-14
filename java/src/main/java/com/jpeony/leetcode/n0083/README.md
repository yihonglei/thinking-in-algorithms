# [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

## 题目

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
Return the linked list sorted as well.

Example 1:
```
Input: head = [1,1,2]
Output: [1,2]
```

Example 2:
```
Input: head = [1,1,2,3,3]
Output: [1,2,3]
```

Constraints:
- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## 题目含义

删除链表中重复元素。

## 算法思路

【迭代】

循环链表节点，相同节点跳跃连接，自然就删除了重复节点；

## 复杂度分析

时间复杂度：O(n)。n 为链表节点个数。

空间复杂度：O(1)。不需要额外空间。
