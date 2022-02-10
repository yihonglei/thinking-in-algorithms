# [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)

## 题目

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, 
then reverse the first k characters and leave the other as original.

Example 1:
```
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
```

Example 2:
```
Input: s = "abcd", k = 2
Output: "bacd"
```

Constraints:
- 1 <= s.length <= 104
- s consists of only lowercase English letters.
- 1 <= k <= 104

## 题目含义

反转每个下标从 2k 的倍数开始的，长度为 k 的子串。若该子串长度不足 k，则反转整个子串。

## 算法思路

【模拟+双指针】

1、字符串下标 2k 背书开始，反转长度为 k 的子串，如果长度不够 k，则全部反转；

2、子串的反转通过双指针完成，就是普通的字符串反转处理方式；

## 复杂度分析

时间复杂度：O(n)。字符串长度。

空间复杂度：O(1)。除了临时变量空间，剩余都是在原数组空间上操作，不需要额外的渐进增长空间。
