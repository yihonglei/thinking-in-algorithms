# [28. Implement strStr()](https://leetcode.com/problems/implement-strstr/)

## 题目

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

Example 1:
```
Input: s = "()"
Output: true
```

Example 2:
```
Input: s = "()[]{}"
Output: true
```

Example 3:
```
Input: s = "(]"
Output: false
```

Constraints:
- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## 题目含义



## 算法思路

【栈】

1、字符串转换为字符数组；

2、左括号入栈，遇到右括号时跟左括号栈顶元素比较，成对则出栈，否则入栈；

3、最后如果栈是空的，则所有符号成对出现，返回 true，否则 返回 false；

## 复杂度分析

时间复杂度：时间复杂度：O(n)。n 为字符串字符个数。

空间复杂度：空间复杂度：O(n)。n 为字符串字符个数。
