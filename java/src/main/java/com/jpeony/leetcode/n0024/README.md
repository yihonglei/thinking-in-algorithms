# [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

## 题目

Given a linked list, swap every two adjacent nodes and return its head. 
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:
```
Input: head = [1,2,3,4]
Output: [2,1,4,3]
```

Example 2:
```
Input: head = []
Output: []
```

Example 3:
```
Input: head = [1]
Output: [1]
```

Constraints:
- The number of nodes in the list is in the range [0, 100].
- 0 <= Node.val <= 100

## 题目含义

将链表里面相邻节点进行两两交换，返回交换后的链表。

## 算法思路

【迭代】

![Leetcode-24-SwapNodesInPairs](https://github.com/yihonglei/thinking-in-algorithms/blob/master/images/java/Leetcode-24-SwapNodesInPairs.png)

1、将原链表变为哨兵节点链表；

2、然后交换相邻两个链表节点，千言万语，不如代码配图看起来得劲；

## 复杂度分析

时间复杂度：O(n)。n 为链表节点个数，对每个节点都需要迭代操作。

空间复杂度：O(1)。哨兵节点链表定义之后固定，在算法执行过程中不需要额外渐进增长空间。