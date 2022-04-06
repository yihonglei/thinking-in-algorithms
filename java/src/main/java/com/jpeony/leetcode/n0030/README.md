# [30. Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)

## 题目

You are given a string s and an array of strings words of the same length. Return all starting indices of substring(s) in 
s that is a concatenation of each word in words exactly once, in any order, and without any intervening characters.

You can return the answer in any order.

Example 1:
```
Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.
```

Example 2:
```
Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
Output: []
```

Example 3:
```
Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
Output: [6,9,12]
```

Constraints:
- 1 <= s.length <= 104
- s consists of lower-case English letters.
- 1 <= words.length <= 5000
- 1 <= words[i].length <= 30
- words[i] consists of lower-case English letters.

## 题目含义

words 按任意组合构成字符串，在 s 中是子串，计算子串的起始位置。
不同组合在 s 中的起始位置不同，按集合的方式返回多个子串的起始位置。

## 算法思路

1、两个哈希表，allWords 记录 words 中单词出现的次数，subWords 记录子串中单词出现的次数；

2、wordNum 为单词个数，wordLen 为单词长度，allLen 为所有单词的总长度；

3、遍历字符串，移动长度为 allLen 的滑动窗口；

4、当这个窗口内一单词出现不存在 allWords 中的单词，或者这个单词在子串中出现的次数已经等于 allWords 中的次数，
这个滑动窗口就不符合要求，直接 break 进入下一个滑动窗口的匹配；

5、一单完全匹配上了，把滑动窗口的起始索引加入结果 res 中；

6、直到遍历完成，最后返回 res 结果集；


## 复杂度分析

时间复杂度：O(m+n)。n 为字符串长度，m 为单词个数。

空间复杂度：O(m)。m 为所有单词长度总和。