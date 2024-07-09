# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## 题目

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:
```
Input: s = "anagram", t = "nagaram"
Output: true
```

Example 2:
```
Input: s = "rat", t = "car"
Output: false
```

Constraints:
- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

***Follow up:*** What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## 题目含义

给定 s, t 两个字符串，如果每个字符出现的次数相同，返回 true，否则返回 false。

## 算法思路

【排序】

1、将字符串 s，t 转为字符数组 sArr，tArr；

2、将 sArr，tArr 排序；

3、比较排序后 sArr，tArr 如果相等则返回 true，否则 返回 false；

【哈希表】

1、定义 26 个字母字典表；

2、分别统计两个字符串字符出现的次数存入哈希表，key 为字符， value 为字符出现次数；

3、循环 26 个字母，分别取两个哈希表字符出现次数进行比较，出现次数不相同，则不是字母异位词，直到 26 个字母迭代完成；

## 复杂度分析

【排序】

时间复杂度：O(nlogn)。n 为字符串的长度，Arrays.sort() 排序时间复杂度为 O(nlogn)，Arrays.equals(sArr, tArr) 比较时间复杂度为 O(n)，
根据加法法则，时间复杂度为 O(nlogn)。

空间复杂度：O(logn)。排序需要 O(logn) 的空间复杂度。

【哈希表】

时间复杂度：O(n)。字符串如果小于 26 个字母， n 为 26，如果大于 26，n 为字符串字符个数。

空间复杂度：O(s)。s 为字符串去重后字符个数。