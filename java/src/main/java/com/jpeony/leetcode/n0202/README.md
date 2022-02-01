# [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

## 题目

Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be ***unique*** and you may return the result in ***any order***.

Example 1:
```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
```

Example 2:
```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
```

Constraints:
- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## 题目含义


## 算法思路

【哈希表】

1、通过 HashSet 对 nums1，nums2 去重为 maps1，maps2；

2、对 maps1 和 maps2 取交集；

## 复杂度分析

时间复杂度：O(m+n)。如果对 m 或者 n 是知道大小的，那么我们就可以根据加法法则确定时间复杂度为 O(m) 或者 O(n)，
但是 m 和 n 大小是无法确定的，任何一块都不能忽略，所以时间复杂度为 O(m+n)。

空间复杂度：O(m+n)。maps1 和 maps2 不能确定那个大小，同时间复杂度分析一样，任何一块都不能忽略，所以空间复杂度为 O(m+n)。