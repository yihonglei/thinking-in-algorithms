# [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

## 题目

Given an input string s, reverse the order of the **words**.

A **word** is defined as a sequence of non-space characters. The **words** in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

**Note** that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
```
Input: s = "the sky is blue"
Output: "blue is sky the"
```

Example 2:
```
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```

Example 3:
```
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
```

Constraints:
- 1 <= s.length <= 104
- s contains English letters (upper-case and lower-case), digits, and spaces ' '.
- There is at least one word in s.

**Follow-up:** If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

## 题目含义

将字符串中空格隔开的单词进行反转，反转后每个单词之间用一个空格隔开。

附加要求：优化为空间复杂度为 O(1) 的算法。

## 算法思路

【迭代】

1、字符串按空格切割为数组；

2、倒序迭代，通过 StringBuilder 拼接字符串，遇到 continue；

时间复杂度：O(n)。n 为空格切割字符串数组的长度；

空间复杂度：O(n)。n 为单词个数；

【语言特性】

1、除去开头和末尾的空白字符；

2、正则匹配连续的空白字符作为分隔符分割；

3、空格号隔开；

## 复杂度分析

时间复杂度：O(n)。n 为空格切割字符串数组的长度；

空间复杂度：O(n)。单词个数；
