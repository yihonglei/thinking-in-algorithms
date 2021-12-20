# [18. 4Sum](https://leetcode.com/problems/4sum/)

## 题目

Given an array nums of n integers, return an array of all the unique quadruplets 
[nums[a], nums[b], nums[c], nums[d]] such that:

- 0 <= a, b, c, d < n
- a, b, c, and d are distinct.
- nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in any order.

Example 1:
```
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

Example 2:
```
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
```

Constraints:
- 1 <= nums.length <= 200
- -109 <= nums[i] <= 109
- -109 <= target <= 109

## 题目含义

在数组中查找 4 个数之和为 target 的去重四元组。

## 算法思路

1、判断数组为 null，或者 数组元素个数小于 4 个，直接返回集合；

2、对数组进行排序

3、寻找等于目标值的去重四元组

- 多层循环嵌套，为了将元素进行四元组合，可以使用暴力求解，四层循环，这里最后一层循环
通过双指针进行优化，时间复杂度减少了一个量级；
- 解决去重的问题，去掉已经发生的四元组重复数组；

## 复杂度分析

时间复杂度：O(n^3)。三层循环嵌套，每层循环 n 次，n 为数组长度，所以时间复杂度为 O(n^3)。

空间复杂度：O(n)。算法额外增量存储空间为存储返回数组的集合，空间复杂度为 O(n)，n 为满足
条件的四元组个数。
