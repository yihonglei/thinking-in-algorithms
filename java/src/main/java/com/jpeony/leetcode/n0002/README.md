# [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## 题目

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

Example 2:
```
Input: l1 = [0], l2 = [0]
Output: [0]
```

Example 3:
```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

Constraints:
- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## 题目含义

两个逆序单链表数值之和构成新链表返回。

## 算法思路

【模拟】
- 1、循环两个链表，特别需要注意，这两个链表的长度可能不一致；
- 2、构建新链表，将链表节点值求和 sum = n1 + n2 + carry，当前值 cur = sum % 10，进位为 carry = sum / 10，
将 cur 构建链表节点合并到链表末尾；
- 3、最后一定要注意处理进位 carry，当链表循环结束时，carry 还是大于 0，需要将 carry 构建节点合并到链表末尾；

注意事项：
- 1、求和时不要忘记了加上进位值 carry；
- 2、链表迭代完之后，最后进位大于 0 时，记得把 carry 构建节点合并到链表末尾；

## 复杂度分析

时间复杂度：O(max(m, n))。链表的最大长度。

空间复杂度：O(1)。除了临时变量空间，不需要额外渐进增长空间。