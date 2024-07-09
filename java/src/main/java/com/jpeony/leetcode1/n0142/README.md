# [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)

## 题目

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously 
following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is 
connected to (***0-indexed***). It is -1 if there is no cycle. ***Note that*** pos ***is not passed as a parameter***.

***Do not modify*** the linked list.

Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```

Example 2:
```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

Example 3:
```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```

Constraints:
- The number of the nodes in the list is in the range [0, 104].
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked-list.

***Follow up:*** Can you solve it using O(1) (i.e. constant) memory?

## 题目含义

判断链表是否有环，如果无环返回 null，如果有环，返回形成环形链表的入口结点。

## 算法思路

【哈希表】

遍历链表，从哈希表判断是否存在链表结点，存在则是环形链表，返回环形链表第一个入环结点，否则存入哈希表，直到链表遍历完成。

时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(n)。n 为链表长度，哈希表需要额外存储 n 个结点空间，所以渐进增长空间复杂度为 O(n)。

【快慢指针】

1、fast，slow 初始指向链表头结点；

2、slow 指针一次走 1 步, fast 指针一次走 2 步;

3、设链表 head 到环的一个点需要 x1 步，从环的第一个点到相遇点需要 x2 步，从环中相遇点回到环的第一个点需要 x3 步。那么环的总⻓度是 x2 + x3 步；

4、fast 和 slow 会相遇，说明他们走的时间是相同的，可以知道他们走的路程有以下的关系:

```
fast 的 t=(x1+x2+x3+x2)/2 slow 的 t=(x1+x2)/1

x1 + x2 + x3 + x2 = 2 * (x1 + x2)

所以 x1 = x3
```

所以 2 个指针相遇以后，如果 slow 继续往前走，fast 指针回到起点 head，两者都每次走一步，那么必定会在环的起点相遇，相遇以后输出这个点即是环形链表入口结点。

时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。只有固定的临时指针变量，不会随着算法执行需要额外的渐进增长空间。

## 复杂度分析

时间复杂度：O(n)。n 为链表长度，迭代 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。只有固定的临时指针变量，不会随着算法执行需要额外的渐进增长空间。