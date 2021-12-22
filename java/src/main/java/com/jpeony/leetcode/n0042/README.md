# [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

## 题目

Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.

Example 1:
```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
```

Example 2:
```
Input: height = [4,2,0,3,2,5]
Output: 9
```

Constraints:
- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## 题目含义

每个宽度为 1 的排列柱子中，计算总共可以接多少雨水。

## 算法思路

1、把柱子与柱子之间想象成木桶，其他面可以认为无穷高，装水的量取决于左右柱子最小高度，就像木桶理论一样；

2、使用双指针，左指针从 0 开始往右扫描，右指针从末端开始往左扫描，左右指针碰撞退出扫描；

3、某个位置装雨水的容量取决于该位置左右位置较小柱子高度与当前位置高度之差，即凹的位置就是装水的位置；

## 复杂度分析

时间复杂度：O(n)。循环了 n 次，所以时间复杂度为 O(n)。

空间复杂度：O(1)。临时变量 ans，leftMax，rightMax，并没有渐进增长空间，所以空间复杂度为 O(1)。
