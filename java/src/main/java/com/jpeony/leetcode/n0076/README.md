# [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)

## 题目

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every 
character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

Example 1:
```
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
```

Example 2:
```
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
```

Example 3:
```
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
```

Constraints:
- m == s.length
- n == t.length
- 1 <= m, n <= 105
- s and t consist of uppercase and lowercase English letters.

**Follow up:** Could you find an algorithm that runs in O(m + n) time?

## 题目含义

计算包含 t 的最小子串

## 算法思路

1、tMap 记录 t 字符出现的次数，subMap 记录滑动窗口子串中字符出现的次数；

2、当 subMap 中出现的字符包含 tMap 时，subMap 窗口范围内的字符串为符合条件的子串，
然后进行下一个窗口匹配，否则，一直遍历到符合条件的窗口；

3、遍历完 s，返回最小符合条件的子串；

## 复杂度分析

时间复杂度：O(m+n)。n 为字符串 s 长度，m 为滑动窗口字符串长度。

空间复杂度：O(m)。m 为滑动窗口字符串长度。