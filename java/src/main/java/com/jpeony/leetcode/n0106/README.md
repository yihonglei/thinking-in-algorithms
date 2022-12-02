# [106. Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)

## 题目

Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is 
the postorder traversal of the same tree, construct and return the binary tree.

Example 1:
```
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]
```

Example 2:
```
Input: inorder = [-1], postorder = [-1]
Output: [-1]
```

Constraints:
- 1 <= inorder.length <= 3000
- postorder.length == inorder.length
- -3000 <= inorder[i], postorder[i] <= 3000
- inorder and postorder consist of unique values.
- Each value of postorder also appears in inorder.
- inorder is guaranteed to be the inorder traversal of the tree.
- postorder is guaranteed to be the postorder traversal of the tree.

## 题目含义

根据中序数组 inorder 和 后序数组 postorder 还原二叉树。

## 算法思路

一、中序遍历和后序遍历的特性
- 在后序遍历序列中，最后一个元素为树的根结点；
- 在中序遍历序列中，根结点的左边为左子树，根结点的右边为右子树；

二、树的还原过程描述

根据中序遍历和后续遍历的特性我们进行树的还原过程分析：
- 首先在后序遍历序列中找到根结点(最后一个元素)
- 根据根结点在中序遍历序列中找到根结点的位置
- 根据根结点的位置将中序遍历序列分为左子树和右子树
- 根据根结点的位置确定左子树和右子树在中序数组和后续数组中的左右边界位置
- 递归构造左子树和右子树
- 返回根结点结束

三、树的还原过程变量定义

需要定义几个变量帮助我们进行树的还原：
- HashMap inorderArrayMap 需要一个哈希表来保存中序遍历序列中,元素和索引的位置关系.
因为从后序序列中拿到根结点后，要在中序序列中查找对应的位置,从而将数组分为左子树和右子树
- int rootIndexInInorderArray 根结点在中序遍历数组中的索引位置
- 中序遍历数组的两个位置标记 [inorderStart, inorderEnd]，inorderStart 是起始位置，inorderEnd 是结束位置
- 后序遍历数组的两个位置标记 [postorderStart, postorderEnd] postorderStart 是起始位置，postorderEnd 是结束位置

四、位置关系的计算

在找到根结点位置以后，我们要确定下一轮中，左子树和右子树在中序数组和后续数组中的左右边界的位置。

- 左子树-中序数组 inorderStart = inorderStart, inorderEnd = rootIndexInInorderArray - 1
- 左子树-后序数组 postorderStart = postorderStart, postorderEnd = postorderStart + rootIndexInInorderArray - inorderStart - 1 
(postorderEnd 计算过程解释，后续数组的起始位置加上左子树长度-1 就是后后序数组结束位置了，左子树的长度 = 根结点索引-左子树)
- 右子树-中序数组 inorderStart = rootIndexInInorderArray + 1, inorderEnd = inorderEnd
- 右子树-后序数组 postorderStart = postorderStart + postorderStart - is, postorderEnd - 1

## 复杂度分析

时间复杂度：

空间复杂度：
