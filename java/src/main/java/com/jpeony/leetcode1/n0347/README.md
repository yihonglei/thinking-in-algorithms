# [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

## 题目

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
```
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
```

Example 2:
```
Input: nums = [1], k = 1
Output: [1]
```

Constraints:
- 1 <= nums.length <= 105
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.

**Follow up:** Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

## 题目含义

数组中前 k 个高频词。

## 算法思路

【最小堆】

1、遍历，通过 HashMap 计算出每个词出现的频次；

2、遍历 HashMap，用最小堆保存频率最大的k个元素；

3、取出最小堆中的元素返回即可；

## 复杂度分析

时间复杂度：O(nlogk)。n 为数组的长度，k 堆的数目。

空间复杂度：O(n)。n 为 map 中 key 的个数。
