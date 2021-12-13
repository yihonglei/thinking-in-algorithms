# [1. Two Sum](https://leetcode.com/problems/two-sum/)

## 题目

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```

Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

## 题目含义

在数组中找 2 个元素，他们的和等于给定目标值，结果返回这 2 个元素对应的数组下标。

## 算法思路

遍历数组，通过目标值与每个元素做差，计算目标值的“另外一半”，在 Map 中查找“另外一半”，

如果找到，则返回 2 个元素的对应数组下标。如果找不到，则将“另外一半”放入 Map 中，

等待下次遍历找到另外一半的时候取出来并返回。

## 复杂度分析

时间复杂度：O(n)。整个代码循环了 n 次，n 为数组的长度，所以时间复杂度为 O(n)；

空间复杂度：O(n)。每次遍历都往 map 存放一次元素，遍历次数 n 为数组长度，所以空间复杂度为 O(n)；
