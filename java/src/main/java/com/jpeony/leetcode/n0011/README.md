# [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

## 题目

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

Example 1:

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
```

Example 2:

```
Input: height = [1,1]
Output: 1
```

Example 3:

```
Input: height = [4,3,2,1,4]
Output: 16
```

Example 4:
```
Input: height = [1,2,1]
Output: 2
```

## 题目含义

在 x 轴上寻找坐标与原点之间线段 a，在 y 轴上寻找线段 b，求 a 与 b 构成矩形的最大面积值，
即求 a * b 的最大值。

## 算法思路

双指针解题技巧。左右两个指针，每次移动构成矩形，计算所构成矩形的面积是否是最大值，
最后返回最大矩形的面积值。

## 复杂度分析

时间复杂度：O(n)。整段代码占用时间最多的是 for 循环，循环了 n 次，n 为数组的长度，
所以时间复杂度是 O(n)。

空间复杂度：O(1)。整个算法计算过程中，只用了一个存储临时最大值的变量空间，
所以空间复杂度是 O(1)。
