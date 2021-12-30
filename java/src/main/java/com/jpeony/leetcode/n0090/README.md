# [90. Subsets II](https://leetcode.com/problems/subsets-ii/)

## 题目

Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
```
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
```

Example 2:
```
Input: nums = [0]
Output: [[],[0]]
```

Constraints:
- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10

## 题目含义

含有重复元素的数组中，寻找所有非重复子集。

## 算法思路

1、注意一个特殊的集合空集，空集是任何集合的子集；

2、回溯算法（试探法）
- 排序
- 在搜索尝试过程中寻找问题的解，在这个问题中就是尝试寻找合适的子集；
- 如果不满足条件，此路不通，就回退一步重新选择，如果不满足非重复子集的条件，回退到上一步，走别的路径寻找；
- 注意去重判断

3、回溯算法模板
- 子集想象为树结构
- for 循环遍历（注意去重，想象为树的方式，通过剪枝去重，相同的值元素不重复处理）
- 递归
- 回溯：处理节点的撤销
- 收集结果
- 返回结果

## 复杂度分析

时间复杂度：O(n×2^n)。一共 2^n 个状态，每种状态需要 O(n) 的时间来构造子集。

空间复杂度：O(n)。渐进空间为存储子集的临时列表，n 为子集个数，所以空间复杂度为 O(n)。
