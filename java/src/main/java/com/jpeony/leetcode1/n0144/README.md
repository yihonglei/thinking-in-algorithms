# [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)

## 题目

Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
```
Input: root = [1,null,2,3]
Output: [1,2,3]
```

Example 2:
```
Input: root = []
Output: []
```

Example 3:
```
Input: root = [1]
Output: [1]
```

Constraints:
- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

**Follow up:** Recursive solution is trivial, could you do it iteratively?

## 题目含义

二叉树先根序遍历。

## 算法思路

【递归】

二叉树先根序遍历，即中左右结点顺序方式遍历结点。

## 复杂度分析

时间复杂度：O(n)。n 为二叉树结点个数。

空间复杂度：O(n)。n 为栈深度。
