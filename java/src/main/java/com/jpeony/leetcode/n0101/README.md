# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

## 题目

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
```
Input: root = [1,2,2,3,4,4,3]
Output: true
```

Example 2:
```
Input: root = [1,2,2,null,3,null,3]
Output: false
```

Example 3:
```
Input: root = []
Output: []
```

Constraints:
- The number of nodes in the tree is in the range [1, 1000].
- -100 <= Node.val <= 100

**Follow up:** Could you solve it both recursively and iteratively?

## 题目含义

检测二叉树结点是否轴对称。

## 算法思路

【迭代】

1、用队列存储 k 层级元素，元素存放顺序为 左的左，右的右，左的右，右的左；

2、每次出队两个元素对比，不相等，则不是轴对称，返回 false，一次迭代完树中的所有结点；

## 复杂度分析

时间复杂度：O(n)。每个点进队出队各一次。

空间复杂度：O(n)。队列元素不超过 n 个。
