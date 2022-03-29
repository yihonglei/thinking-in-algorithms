# [287. Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

## 题目

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
```
Input: nums = [1,3,4,2,2]
Output: 2
```

Example 2:
```
Input: nums = [3,1,3,4,2]
Output: 3
```

Constraints:
- 1 <= n <= 105
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only once except for precisely one integer which appears two or more times.

Follow up:
- How can we prove that at least one duplicate number must exist in nums?
- Can you solve the problem in linear runtime complexity?

## 题目含义

数组中查找重复元素，要求空间复杂度为 O(1)。

## 算法思路

【快慢指针】快慢指针思想, fast 和 slow 是指针, nums[slow] 表示取指针对应的元素
注意 nums 数组中的数字都是在 1 到 n 之间的(在数组中进行游走不会越界),
因为有重复数字的出现, 所以这个游走必然是成环的, 环的入口就是重复的元素。

## 复杂度分析

时间复杂度：O(n)。n 为数组长度。

空间复杂度：O(1)。只需要临时变量空间。