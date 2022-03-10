# [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)

## 题目

Given a root node reference of a BST and a key, delete the node with the given key in the BST. 
Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:
- 1.Search for a node to remove.
- 2.If the node is found, delete the node.

Example 1:
```
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
```

Example 2:
```
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.
```

Example 3:
```
Input: root = [], key = 0
Output: []
```

Constraints:
- The number of nodes in the tree is in the range [0, 104].
- -105 <= Node.val <= 105
- Each node has a unique value.
- root is a valid binary search tree.
- -105 <= key <= 105

## 题目含义

在二叉树中删除给定值的节点。

## 算法思路

树的节点删除情况：
- 1.如果要删除的节点为叶节点，直接删除；
- 2.如果要删除的节点左节点不为空，右节点为空，则直接用左节点替换掉当前节点；
- 3.如果要删除的节点右节点不为空，左节点为空，则直接用右节点替换掉当前节点；
- 4.如果要删除的节点左右节点均不为空，寻找右子树中最左节点，用这个最左节点替换掉当前节点，
并且将最左节点从原位置删除；

## 复杂度分析

时间复杂度：O(logN)。

空间复杂度：O(h)。递归时树的高度，即递归的栈空间。
