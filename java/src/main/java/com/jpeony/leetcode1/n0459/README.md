# [459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)

## 题目

Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:
```
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
```

Example 2:
```
Input: s = "aba"
Output: false
```

Example 3:
```
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
```

Constraints:
- 1 <= s.length <= 104
- s consists of lowercase English letters.

## 题目含义

判断一个字符串是否可以由多个子串重复构成。

## 算法思路

1、先算子串 tempSub：字符串第一个字符为起始字符，寻找重复字符，期间左闭右开为子串；

2、判断重复子串：判断字符串是不是重复的子串 tempSub；

## 复杂度分析

时间复杂度：

空间复杂度：