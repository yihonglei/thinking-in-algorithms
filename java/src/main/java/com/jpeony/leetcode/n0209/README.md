# [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)

## 题目

Given an array of positive integers nums and a positive integer target, 
return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] 
of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
```
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
```

Example 2:
```
Input: target = 4, nums = [1,4,4]
Output: 1
```

Example 2:
```
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
```

Constraints:
- 1 <= target <= 109
- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105

Follow up: 

If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).

## 题目含义

在数组 nums 中寻找元素和 >= target 的最小子数组，要求时间复杂度调优到 O(n log(n))。

## 算法思路

【双指针】

1、判断如果数组为空，返回 0；

2、定义两个指针，leftPoint和rightPoint，初始位置均指向数组开始位置；

3、右指针位置元素进行求和 sum，如果 sum < target，则说明当前子数组和小于 target，

右指针继续向右移动，寻找下一个位参与子数组求和，如果 sum >= target，则子数组的长度

为 （rightPoint - leftPoint + 1），通过 Math.min 保留最小长度，这个时候左指针向右移动，

缩短数组的长度， 一但出现 sum < target，继续重复上面的逻辑，直到整个数组都遍历完成。

4、最后通过 Math.min 保留的数组长度，即为满足条件的最小数组长度。

## 复杂度分析

时间复杂度：O(n)。整个数组的遍历次数 n。

空间复杂度：O(1)。临时变量空间 ans。
