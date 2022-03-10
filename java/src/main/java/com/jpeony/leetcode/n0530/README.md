# [530. Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)

## 题目

Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

Example 1:
```
Input: root = [4,2,6,1,3]
Output: 1
```

Example 2:
```
Input: root = [1,0,48,null,null,12,49]
Output: 1
```

Constraints:
- The number of nodes in the tree is in the range [2, 104].
- 0 <= Node.val <= 105

## 题目含义

返回二叉搜索数中任意两个节点之差绝对值等于数中节点值的最小的差值。

## 算法思路

【深度优先+中序遍历】

1、二叉搜索树节点值的大小顺序，左 < 中 < 右；

2、采用中序遍历，能按大小顺序遍历；

3、后一个值减掉前一个值，做差就一定是正值，不需要取绝对值；

## 复杂度分析

时间复杂度：O(n)。n 为二叉搜索树节点个数。

空间复杂度：O(n)。递归的深度节点个数 n。
