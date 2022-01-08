# [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)

## 题目

Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

Example 1:
```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
```

Example 2:
```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```

Constraints:
- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums is sorted in non-decreasing order.

Follow up: 

Squaring each element and sorting the new array is very trivial, 
could you find an O(n) solution using a different approach?

## 题目含义

计算自增数组每个元素的平方值，返回新的每个元素平方值的数组，要求平方数组也是自增的，并且要求优化时间复杂度为 O(n)。

## 算法思路

方法1、【直接排序】 

1）循环数组中的每个元素求平方得到平方值数组

2）快速排序即可

时间复杂度：O(nlogn)，不满足优化要求 O(n)，没有一种排序的时间复杂度是 O(n)。

空间复杂度：O(1)，可以在原数组上操作，不需要额外空间。

方法2、【双指针】

如果数组全部是正数，那么直接平方就满足条件，如果全部负数，可以倒序迭代也能满足条件，
但是，数组中含有正数，含有负数，可能出现不按照全正数或全负数的逻辑走，这种情况只存在于数组的
两端，所以，取数组两端的值进行平方比较大小，较大值依次从右到左放入数组即可，如果平方较大值出现在左边，
那么依次从左边取值进行平方比较，如果平方较大值出现在右边，那么依次从右边取值进行平方比较，
直到数组中元素遍历完成为止。

时间复杂度：O(n)。n 为数组的长度，循环了 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。除了存储数组的空间，额外的只有临时变量空间，所以渐进空间复杂度为 O(1)。

## 复杂度分析

时间复杂度：O(n)。n 为数组的长度，循环了 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。除了存储数组的空间，额外的只有临时变量空间，所以渐进空间复杂度为 O(1)。
