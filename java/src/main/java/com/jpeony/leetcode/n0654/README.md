# [654. Maximum Binary Tree](https://leetcode.com/problems/maximum-binary-tree/)

## 题目

You are given an integer array nums with no duplicates. A maximum binary tree can be built recursively from nums using the following algorithm:
- 1.Create a root node whose value is the maximum value in nums.
- 2.Recursively build the left subtree on the subarray prefix to the left of the maximum value.
- 3.Recursively build the right subtree on the subarray suffix to the right of the maximum value.

Return the maximum binary tree built from nums.

Example 1:
```
Input: nums = [3,2,1,6,0,5]
Output: [6,3,5,null,2,0,null,null,1]
Explanation: The recursive calls are as follow:
- The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
    - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
        - Empty array, so no child.
        - The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
            - Empty array, so no child.
            - Only one element, so child is a node with value 1.
    - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
        - Only one element, so child is a node with value 0.
        - Empty array, so no child.
```

Example 2:
```
Input: nums = [3,2,1]
Output: [3,null,2,null,1]
```

Constraints:
- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 1000
- All integers in nums are unique.

## 题目含义

根据不重复数组构建二叉树，构建规则如下：

- 创建一个根节点，其值为 nums 中的最大值。
- 递归地在最大值 左边 的 子数组前缀上 构建左子树。
- 递归地在最大值 右边 的 子数组后缀上 构建右子树。

## 算法思路

【递归+分治算法】

1、递归终止条件 l > r；

2、数组最大值下标位置作为左右逻辑子数组分割的边界条件，分治子数组左闭右闭范围分割；

3、个人觉得不要尝试人肉执行递归过程，机器适合干重复的事情，否则会陷入到递归的逻辑陷阱，跳不出来，
只要保证一次做的事情是对的，后面让机器重复去做，直到完成，即达到递归退出条件退出执行；

## 复杂度分析

时间复杂度：O(n^2)。

空间复杂度：O(n)。
