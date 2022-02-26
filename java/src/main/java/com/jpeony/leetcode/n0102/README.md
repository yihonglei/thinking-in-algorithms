# [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

## 题目

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Example 1:
```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
```

Example 2:
```
Input: root = [1]
Output: [[1]]
```

Example 3:
```
Input: root = []
Output: []
```

Constraints:
- The number of nodes in the tree is in the range [0, 2000].
- -1000 <= Node.val <= 1000

## 题目含义

分层次遍历。

## 算法思路

【BFS 广度优先搜索】

1、用队列存储分层；

2、root 为第一层；

## 复杂度分析

时间复杂度：O(n)。每个点进队出队各一次。

空间复杂度：O(n)。队列元素不超过 n 个。
