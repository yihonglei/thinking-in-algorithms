# [15. 3Sum](https://leetcode.com/problems/3sum/)

## 题目

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

Example 2:
```
Input: nums = []
Output: []
```

Example 3:
```
Input: nums = [0]
Output: []
```

## 题目含义

在数组中寻找所有和为 0 且不重复的三元组返回。

## 算法思路

1、判断数组为 null 或者 长度小于 3，返回空数组；

2、对数组进行升序排序；

3、遍历寻找三元组

- 组合所有可能出现的三元组
- 去重重复的三元组

## 复杂度分析

时间复杂度：O(n^2)。两层 n 次循环，根据乘法法则，时间复杂度为 O(n^2)。

空间复杂度：O(n)。返回数组的存储空间。
