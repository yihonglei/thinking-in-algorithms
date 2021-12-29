# [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

## 题目

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```

Example 2:
```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```

Example 3:
```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. 
The 0 is only there to ensure the merge result can fit in nums1.
```

Constraints:
- nums1.length == m + n
- nums2.length == n
- 0 <= m, n <= 200
- 1 <= m + n <= 200
- -109 <= nums1[i], nums2[j] <= 109

## 题目含义

将两个有序数组进行合并，返回合并后的有序数组。

## 算法思路

【合并+排序方式】
- 两个数组先合并；
- 将合并后的数组排序即可；

【双指针】
- 声明一个临时数组；
- 定义 p1，p2 两个指针分别指向数组 nums1 和 nums2 的初始位置；
- 循环依次比较两个数组的元素，较小值依次从左到右放入临时数组；
- 将合并升序的临时数组赋值到 nums1；

【逆向双指针】
- 定义 p1，p2 两个指针分别指向数组 nums1 和 nums2 的末尾位置；
- 根据题意，nums1 空间能盖住 nums2 的所有元素，声明一个指向 nums1 涵盖空间的末尾变量 tail；
- 循环依次比较两个数组的元素，根据 tail 下标索引位置变动，将较大值依次从右到左放入 nums1 中；

## 复杂度分析

逆向双指针时间和空间复杂度最优。

时间复杂度：时间复杂度：O(m + n)。指针移动总次数，两个数组长度的和 m + n，所以时间复杂度为 O(m+n)。

空间复杂度：空间复杂度：O(1)。原地操作数组，不需要额外新增空间，所以空间复杂度为 O(1)。
