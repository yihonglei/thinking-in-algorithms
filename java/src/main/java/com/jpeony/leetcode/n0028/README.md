# [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

## 题目

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. 
This is consistent to C's strstr() and Java's indexOf().

Example 1:
```
Input: haystack = "hello", needle = "ll"
Output: 2
```

Example 2:
```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

Example 3:
```
Input: haystack = "", needle = ""
Output: 0
```

Constraints:
- 0 <= haystack.length, needle.length <= 5 * 104
- haystack and needle consist of only lower-case English characters.

## 题目含义

在字符串里面查找子字符串在字符串中的下标位置。

## 算法思路

【滑动窗口】

1、两个指针 i，j；

2、寻找首字母相等，继续遍历字符，与子串字符逐个比较，直到全部匹配为止，否则继续移动首字母到下一位，重复逻辑；

## 复杂度分析

时间复杂度：O(m*n)。m 为 haystack 字符长度，n 为 needle 字符长度；

空间复杂度：O(1)。除了临时变量，不需要额外渐进增长空间；
