# [239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)

## 题目

You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:
```
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

Example 2:
```
Input: nums = [1], k = 1
Output: [1]
```

Constraints:
- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- 1 <= k <= nums.length

## 题目含义

在数组中 k 长度子数组从左到右滑动窗口，求每个窗口的最大值，最后返回每个窗口最大值数组。

## 算法思路

【暴力求解】

参考代码 maxSlidingWindowForce，大数据量超时，时间复杂度为 O(n * m)，n 为数组长度，m 为窗口数组长度。

【单调队列】

1、nums 中 k 个元素窗口先进入单调队列；

2、没移动一个元素，从队头添加一个元素，从队尾移出一个元素，保证 k 个元素的窗口子数组；

## 复杂度分析

时间复杂度：O(n)。n 为数组 nums 长度。

空间复杂度：O(k)。k 为窗口子数组的长度。
