# [344. Reverse String](https://leetcode.com/problems/reverse-string/)

## 题目

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```

Example 2:
```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```

Constraints:
- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## 题目含义

将字符数组元素进行反转。

## 算法思路

【双指针】

- 定义左指针指向字符数组起始位置，右指针指向字符数组末尾位置；
- 左指针向右移动，右指针向左移动，每轮循环左右指针指向位置元素进行交换，直到左右指针重叠则退出循环，
完成字符串反转；

## 复杂度分析

时间复杂度：O(n)。n 为字符数组长度。

空间复杂度：O(1)。左右指针临时变量，不需要额外渐进增长空间。
