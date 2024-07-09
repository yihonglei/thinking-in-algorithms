# [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

## 题目

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

Example 2:
```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

Example 3:
```
Input: nums = [], target = 0
Output: [-1,-1]
```

Constraints:
- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.

## 题目含义

升序数组中查找目标值开始位置和结束位置，并返回位置数组。

## 算法思路

【二分查找】
- 先通过二分查找找到目标值所在位置；
- 向前移步寻找第一个等于目标值的位置；
- 向后移动寻找最后一个等于目标值的位置；

## 复杂度分析

时间复杂度：O(logn)。

空间复杂度：O(1)。临时变量空间返回数组。