# [1047. Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)

## 题目

You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Example 1:
```
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
```

Example 2:
```
Input: s = "azxxzy"
Output: "ay"
```

Constraints:
- 1 <= s.length <= 105
- s consists of lowercase English letters.

## 题目含义

字符串中相邻字符相同从字符串移出，得到新串后重复移出的动作，返回最后没有相邻字符相同的字符串。

## 算法思路

【栈】

1、字符串转换为字符数组；

2、字符与栈顶元素比较，相等则出栈，否则入栈，直到字符数组迭代完成；

3、剩余栈里的元素就是去重后的字符，合并成字符串返回即为结果；

## 复杂度分析

时间复杂度：O(n)。n 为字符串字符个数；

空间复杂度：O(n)。n 为去重后字符串字符个数。
