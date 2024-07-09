# [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

## 题目

Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:
```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
```

Example 2:
```
Input: root = [1]
Output: ["1"]
```

Constraints:
- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## 题目含义

计算二叉树边的条数集合。

## 算法思路

【深度优先搜索】

【广度优先搜索】

## 复杂度分析

时间复杂度：O(n)。每个点进队出队各一次。

空间复杂度：O(n)。队列元素不超过 n 个。
