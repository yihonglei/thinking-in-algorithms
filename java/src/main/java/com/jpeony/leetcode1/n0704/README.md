# [704. Binary Search](https://leetcode.com/problems/binary-search/)

## 题目

Given an array of integers nums which is sorted in ascending order, and an integer target, 
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

Example 2:
```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```

Constraints:
- 1 <= nums.length <= 104
- -104 < nums[i], target < 104
- All the integers in nums are unique.
- nums is sorted in ascending order.

## 题目含义

在元素不重复的升序数组 nums 中查找目标值 target 的下标并返回，如果查不到，返回 -1，要求时间复杂度必须为 O(log n)。

## 算法思路

普通的二分查找，每次取中间值 mid 与目标值 target 比较：

1、如果 mid == target，则返回下标；

2、如果 mid > target，说明查找目标值只可能存在于中间值的左边数组部分，把左边部分当成新数组，继续取中间值比较；

3、如果 mid < target，说明查找目标值只可能存在于中间值的右边数组部分，把右边部分当成新数组，继续取中间值比较；

可以使用循环实现，也可以使用递归实现，循环和递归之间的实现逻辑是可以相互转换的。

## 复杂度分析

时间复杂度：O(log n)。二分查找每次都是二分治折半查找，所以时间复杂度为 O(log n)。

空间复杂度：O(1)。只是用了临时变量 mid，所以空间复杂度为 O(1)。
