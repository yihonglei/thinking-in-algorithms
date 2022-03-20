# [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

## 题目

Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
```
Input: head = [1,2,2,1]
Output: true
```

Example 2:
```
Input: head = [1,2]
Output: false
```

Constraints:
- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

## 题目含义

判断链表是否是回文链表，即链表中元素正着读和反着读一样。

## 算法思路

【双指针】将链表中元素复制到集合中，通过双指针判断是否回文链表。

【快慢指针】通过快慢指针找到链表的中间节点，将链表后半段进行反转，然后将链表前半段和反转的后半段迭代进行比较，
相同则是回文链表，否则不是回文链表。

## 复杂度分析

时间复杂度：

空间复杂度：