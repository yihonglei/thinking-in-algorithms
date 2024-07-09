# [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

## 题目

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again 
by continuously following the next pointer. Internally, pos is used to denote the index of the 
node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
```

Example 2:
```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
```

Example 3:
```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

Constraints:
- The number of the nodes in the list is in the range [0, 104].
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked-list.

***Follow up:*** Can you solve it using O(1) (i.e. constant) memory?

## 题目含义

判断链表是否有环，无环返回 false，有环返回 true。

## 算法思路

【哈希表】

遍历链表，从哈希表判断是否存在链表结点，存在则是环形链表，返回 true，否则存入哈希表，直到链表遍历完成，最后返回 false。

时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(n)。n 为链表长度，哈希表需要额外存储 n 个结点空间，所以渐进增长空间复杂度为 O(n)。

【快慢指针】

1、fast，slow 初始指向链表头结点；

2、slow 指针一次走 1 步, fast 指针一次走 2 步;

3、设链表 head 到环的一个点需要 x1 步，从环的第一个点到相遇点需要 x2 步，从环中相遇点回到环的第一个点需要 x3 步。那么环的总⻓度是 x2 + x3 步；

4、如果 fast 和 slow 相遇，则存在环形，返回 true，否则返回 false;

时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。只有固定的临时指针变量，不会随着算法执行需要额外的渐进增长空间。

## 复杂度分析

时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。只有固定的临时指针变量，不会随着算法执行需要额外的渐进增长空间。