# [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

## 题目

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

Example 2:
```
Input: head = [1,2]
Output: [2,1]
```

Example 3:
```
Input: head = []
Output: []
```

Constraints:
- The number of nodes in the list is the range [0, 5000].
- -5000 <= Node.val <= 5000

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

## 题目含义

将单链表进行反转。

## 算法思路

链表原地反转

## 复杂度分析

时间复杂度：O(n)。n 为链表长度，迭代次数，所以时间复杂度为 O(n)。

空间复杂度：O(1)。链表原地操作，只需要一个临时变量空间，所以空间复杂度为 O(1)。
