# [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)

## 题目

Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
return the area of the largest rectangle in the histogram.

Example 1:
```
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
```

Example 2:
```
Input: heights = [2,4]
Output: 4
```

Constraints:
- 1 <= heights.length <= 105
- 0 <= heights[i] <= 104

## 题目含义

在柱状图中，寻找勾画出面积最大的矩形。

## 算法思路

1、判断，如果数组为空，返回 0；

2、如果数组只有一个元素，最大面积为该元素的高度；

3、在数组前后添加哨兵结点；

4、当数组右边的 bar 大于左边的 bar 时，入栈，当右边 bar 小于左边的 bar 时，出栈开始计算面积；
- 高就是数组元素的高度；
- 宽度为勾画的矩形经历了几个 bar；


## 复杂度分析

时间复杂度：O(n)。循环了 n 次，n 为数组长度，所以时间复杂度为 O(n)。

空间复杂度：O(n)。渐进增长空间未 stack 栈，存储元素个数为栈中元素 n 个，所以空间复杂度为 O(n)。
