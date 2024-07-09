# [79. Word Search](https://leetcode.com/problems/word-search/)

## 题目

Given an m x n grid of characters board and a string word, 
return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. 
The same letter cell may not be used more than once.

Example 1:
```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
```

Example 2:
```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
```

Example 3:
```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
```

Constraints:
- m == board.length
- n = board[i].length
- 1 <= m, n <= 6
- 1 <= word.length <= 15
- board and word consists of only lowercase and uppercase English letters.

Follow up: Could you use search pruning to make your solution faster with a larger board?

## 题目含义

判定一个单词是否在二维网格中，单词由二维网格相邻（横向或纵向垂直相邻）字母组成。

## 算法思路

1、从网格第一个格子开始，从上，右，下，左四个方向（顺序任意）搜索符合条件的字母；

2、DFS 在网格中搜索符合条件字母，当遇到不符合时，回溯到上一步，走别的路继续搜索；

3、DFS 搜索到与目标字符串 string 符合返回 true，否则搜索完整个网格，
如果都未找到符合条件的 string，返回 false；

## 复杂度分析

时间复杂度：O(m * n)。可以简单的判断，m 为网格的宽，n 为网格的高，两层循环嵌套，所以时间复杂度为 O(m * n)；

空间复杂度：O(n)。渐进增长空间为存储遍历过的数组标记 visited，n 为 二维数组元素个数，所以空间复杂度为 O(n)；
