# [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

## 题目

Given the head of a linked list and an integer val, 
remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example 1:
```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
```

Example 2:
```
Input: head = [], val = 1
Output: []
```

Example 3:
```
Input: head = [7,7,7,7], val = 7
Output: []
```

Constraints:
- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50

## 题目含义

移出链表中给定目标值 target 的元素，返回移出 target 后的新链表。

## 算法思路

【暴力求解】

1、创建一个空链表；

2、循环每个元素与 target 比较，相等则跳过，否则新构建结点追加到新链表的尾部。

时间复杂度：O(n)。链表遍历次数，n 为链表长度，所以时间复杂度为 O(n)。

空间复杂度：O(n)。n 为新链表元素的个数。

【迭代】

1、使用链表哑结点（dummy）链表技巧；

2、链表中相等于目标值的，剪断该结点，通过链表直接跨过该结点衔接，删除该结点；

## 复杂度分析

时间复杂度：O(n)。链表遍历次数，n 为链表长度，所以时间复杂度为 O(n)。

空间复杂度：O(1)。固定链表上操作，不需要额外渐进增长空间。
