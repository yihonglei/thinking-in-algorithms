# [75. Sort Colors](https://leetcode.com/problems/sort-colors/)

## 题目

Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, 
white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:
```
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

Example 2:
```
Input: nums = [2,0,1]
Output: [0,1,2]
```

Constraints:
- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?

## 题目含义

对数组进行原地正序排序。

## 算法思路

1、原地排序要求空间复杂度是 O(1)，如果用快速排序，空间复杂度是 O(nlogn)，不满足条件，
如果用冒泡、插入、选择、堆排序满足了空间复杂度 O(1)，但是时间复杂度 > O(n)，时间复杂度
不是最优的；

2、使用双指针操作排序
- 右指针负责操作等于 2 的元素依次从数组最右边往左安放
- 左指针负责操作等于 0 的元素依次从数组最左边往右安放
- 不用关心 1 往哪里放置，当 0，2 放置完成，1 自然位于中间天然放置完成
- 当左右指针碰撞时退出循环

## 复杂度分析

时间复杂度：O(n)。遍历了 n 遍，n 为数组的长度，所以时间复杂度为 O(n)。

空间复杂度：O(1)。只有临时变量空间，不需要渐进增长空间，所以空间复杂度为 O(1)。
