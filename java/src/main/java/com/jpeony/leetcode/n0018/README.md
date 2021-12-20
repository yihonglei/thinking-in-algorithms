# [16. 3Sum Closest](https://leetcode.com/problems/3sum-closest/)

## 题目

Given an integer array nums of length n and an integer target, 
find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
```

Example 2:
```
Input: nums = [0,0,0], target = 1
Output: 0
```

Constraints:
```
3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-104 <= target <= 104
```

## 题目含义

在数组中寻找三元组，它们的和最接近给定目标值，返回三元组的和。

## 算法思路

1、判断数组为 null 或者 数组长度小于 3，直接返回 0；

2、数组排序；

3、双指针解题技巧
- 对数组三元组进行扫描，逐渐夹逼出最接近 target 值；
- 可以不用考虑去重，因为计算绝对值最近目标值的假设值不会被覆盖；

## 复杂度分析

时间复杂度：O(n^2)。内外两层循环，n * n 为 n^2 次执行，所以时间复杂度为 O(n^2)。

空间复杂度：O(1)。增量空间为临时变量 closestNum，没有别的渐进增长空间，所以空间复杂度为 O(1)。
