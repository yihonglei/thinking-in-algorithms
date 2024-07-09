# [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/)

## 题目

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.
- For example, 121 is a palindrome while 123 is not.

Example 1:
```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

Example 2:
```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

Example 3:
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

Constraints:
- -2^31 <= x <= 2^31 - 1

## 题目含义

一个正整数正序读和反序读一样，是回文数返回 true，否则返回 false。

## 算法思路

1、【反转比较】

将 [整数反转](https://jpeony.blog.csdn.net/article/details/122524582) ，与原数比较，相同则是回文数返回 true，否则返回 false。

2、【双指针】

- 负数一定不是回文数；

- 整数个位数一定是回文数；

- 整数转换为字符数组，左右指针遍历比较前后位置字符是否相同，不想同，则不是回文；

## 复杂度分析

时间复杂度：O(logn)。每次迭代都可能退出循环。

空间复杂度：O(1)。只需要临时变量，不需要其他额外的渐进增长空间，所以空间复杂度是 O(1)。