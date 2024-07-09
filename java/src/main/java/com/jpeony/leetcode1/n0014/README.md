# [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

## 题目

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

Example 2:
```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

Constraints:
- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lower-case English letters.

## 题目含义

最长公共前缀。

## 算法思路

【顺序遍历】
- 当字符数组长度为 0 时，则公共前缀为空，直接返回即可
- 寻找数组中最短字符串，避免寻找公共前缀时越界判断复杂性
- 基于最小字符串循环顺序比较各个字符串的公共字符
- 以 a 为基准字符（最短字符串循环的各个字符，作为每一轮的基准字符）
- 如果数组中循环顺序字符串字符与 a 不相等，则不存在公共字符串
- 如果依次比较到数组最后一个字符串还依然坚挺相等，则是公共字符
- 最后返回公共前缀

## 复杂度分析

时间复杂度：O(m * n)。m 是数组最短字符串长度，n 为数组字符串个数。

空间复杂度：O(n)。公共前缀长度。