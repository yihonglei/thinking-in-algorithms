# [162. Find Peak Element](https://leetcode.com/problems/find-peak-element/)

## 题目

A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

Example 1:
```
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
```

Example 2:
```
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
```

Constraints:
- 1 <= nums.length <= 1000
- -231 <= nums[i] <= 231 - 1
- nums[i] != nums[i + 1] for all valid i.

## 题目含义

返回任意一个峰值，一个值大于相邻左边和右边的值即为峰值。

## 算法思路

【二分爬坡】
二分找中间位置 mid，如果 mid > mid + 1，则继续往左侧寻找峰值，爬坡，
如果 mid < mid + 1 则往右侧寻找峰值，爬坡。往高处走才可能找到峰值，
如果往低处走，可能永远就不会找到峰值。

## 复杂度分析

时间复杂度：O(logn)。

空间复杂度：O(1)。