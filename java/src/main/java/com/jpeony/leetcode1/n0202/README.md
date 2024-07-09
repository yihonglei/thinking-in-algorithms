# [202. Happy Number](https://leetcode.com/problems/intersection-of-two-arrays/)

## 题目

Write an algorithm to determine if a number n is happy.

A **happy number** is a number defined by the following process:
- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
- Those numbers for which this process **ends in 1** are happy.

Return true if n is a happy number, and false if not.

Example 1:
```
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```

Example 2:
```
Input: n = 2
Output: false
```

Constraints:
- 1 <= n <= 231 - 1

## 题目含义

一个整数等于每位数的平方和，一直循环，直到为 1，就是一个快乐数，返回 true，否则不是快乐数，返回 false;

## 算法思路

【迭代】

- 每个数的各个位平方求和进行计算下一次数值，如果等于 1，返回 true，否则返回 false;
- 如果一直都不出现 1，循环退出的条件是什么？出现环形数值时候，退出循环，如果不是快乐数，
平方求和的过程一定会形成环形数，通过 HashSet 记录每次平方求和的 n，检测环形数，如果是环形数
返回 false，否则找到是快乐数为止；
- 通过上面两条确定了出现快乐数和非快乐数的退出条件，避免出现死循环；

## 复杂度分析

时间复杂度：O(logn)。时间复杂度取决于每次平方求和计算后的数值位数。

空间复杂度：O(logn)。存入哈希的元素个数。