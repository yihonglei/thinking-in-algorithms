# [383. Ransom Note](https://leetcode.com/problems/ransom-note/)

## 题目

Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
```
Input: ransomNote = "a", magazine = "b"
Output: false
```

Example 2:
```
Input: ransomNote = "aa", magazine = "ab"
Output: false
```

Example 3:
```
Input: ransomNote = "aa", magazine = "aab"
Output: true
```

Constraints:
- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

## 题目含义

magazine 中的字符可以构成 ransomNote 的字符串，返回 true，否则返回 false，
注意 magazine 每个字符只能用一次。

## 算法思路

【哈希表】

1、分别统计 ransomNote 和 magazine 单词每个字符出现的次数到哈希表；

2、比较统计字符数量，magazine 中每个字符出现的次数大于等于 ransomNote 中字符出现的次数，
则返回 true，否则返回 false；

## 复杂度分析

时间复杂度：O(m + n)。m 为 ransomNote 的长度，n 为 magazine 的长度，不知道哪个字符串长，只能同时算上。

空间复杂度：O(m + n)。额外空间为字符去重单词数，m 为 ransomNote 去重字符数，n 为 magazine 去重单词数。