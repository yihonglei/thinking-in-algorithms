# 前言

1、[数据结构与算法理论和 leetcode 题目分类思维导图；](https://github.com/yihonglei/thinking-in-algorithms/tree/master/xmind)

2、重点数据结构与算法

![数据结构](https://github.com/yihonglei/thinking-in-algorithms/blob/master/images/base/structure.png) ![算法](https://github.com/yihonglei/thinking-in-algorithms/blob/master/images/base/algorithms.png)

3、算法书籍推荐
- 入门系列：《算法图解》、《大话数据结构》、《编程之美》
- 课本系列：《数据结构与算法分析 : Java 语言描述》、《数据结构与算法分析 : C 语言描述》
- 进阶系列：《算法导论》
- 扩展系列：《算法之美》、《算法帝国》
- 殿堂系列：《计算机程序设计艺术》

4、Java 代码基于 JDK8 实现；

# 目录

[一、数据结构](https://github.com/yihonglei/thinking-in-algorithms#%E4%B8%80%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84)

- [数组](https://github.com/yihonglei/thinking-in-algorithms#%E6%95%B0%E7%BB%84)
- [链表](https://github.com/yihonglei/thinking-in-algorithms#%E9%93%BE%E8%A1%A8)
- [栈](https://github.com/yihonglei/thinking-in-algorithms#%E6%A0%88)
- [队列](https://github.com/yihonglei/thinking-in-algorithms#%E9%98%9F%E5%88%97)
- [字符串](https://github.com/yihonglei/thinking-in-algorithms#%E5%AD%97%E7%AC%A6%E4%B8%B2)
- [哈希表](https://github.com/yihonglei/thinking-in-algorithms#%E5%93%88%E5%B8%8C%E8%A1%A8)
- [树](https://github.com/yihonglei/thinking-in-algorithms#%E6%A0%91)
- [堆](https://github.com/yihonglei/thinking-in-algorithms#%E5%A0%86)
- [跳表](https://github.com/yihonglei/thinking-in-algorithms#%E8%B7%B3%E8%A1%A8)
- [并查集](https://github.com/yihonglei/thinking-in-algorithms#%E5%B9%B6%E6%9F%A5%E9%9B%86)
- [线段树](https://github.com/yihonglei/thinking-in-algorithms#%E7%BA%BF%E6%AE%B5%E6%A0%91)
- [树状数组](https://github.com/yihonglei/thinking-in-algorithms#%E6%A0%91%E7%8A%B6%E6%95%B0%E7%BB%84)
- [图](https://github.com/yihonglei/thinking-in-algorithms#%E5%9B%BE)

[二、算法](https://github.com/yihonglei/thinking-in-algorithms#%E4%BA%8C%E7%AE%97%E6%B3%95)

- [递归](https://github.com/yihonglei/thinking-in-algorithms#%E9%80%92%E5%BD%92)
- [尾递归](https://github.com/yihonglei/thinking-in-algorithms#%E5%B0%BE%E9%80%92%E5%BD%92)
- [排序](https://github.com/yihonglei/thinking-in-algorithms#%E6%8E%92%E5%BA%8F)
- [二分查找](https://github.com/yihonglei/thinking-in-algorithms#%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE)
- [哈希算法](https://github.com/yihonglei/thinking-in-algorithms#%E5%93%88%E5%B8%8C%E7%AE%97%E6%B3%95)
- [字符串匹配](https://github.com/yihonglei/thinking-in-algorithms#%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%8C%B9%E9%85%8D)
- [搜索](https://github.com/yihonglei/thinking-in-algorithms#%E6%90%9C%E7%B4%A2)
- [随机化](https://github.com/yihonglei/thinking-in-algorithms#%E9%9A%8F%E6%9C%BA%E5%8C%96)
- [图论](https://github.com/yihonglei/thinking-in-algorithms#%E5%9B%BE%E8%AE%BA)
- [贪心](https://github.com/yihonglei/thinking-in-algorithms#%E8%B4%AA%E5%BF%83)
- [几何](https://github.com/yihonglei/thinking-in-algorithms#%E5%87%A0%E4%BD%95)
- [数论](https://github.com/yihonglei/thinking-in-algorithms#%E6%95%B0%E8%AE%BA)
- [矩阵](https://github.com/yihonglei/thinking-in-algorithms#%E7%9F%A9%E9%98%B5)
- [枚举](https://github.com/yihonglei/thinking-in-algorithms#%E6%9E%9A%E4%B8%BE)
- [回溯算法](https://github.com/yihonglei/thinking-in-algorithms#%E5%9B%9E%E6%BA%AF%E7%AE%97%E6%B3%95)
- [动态规划](https://github.com/yihonglei/thinking-in-algorithms#%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92)

[三、算法技巧](https://github.com/yihonglei/thinking-in-algorithms#%E4%B8%89%E7%AE%97%E6%B3%95%E6%8A%80%E5%B7%A7)

- [双指针](https://github.com/yihonglei/thinking-in-algorithms#%E5%8F%8C%E6%8C%87%E9%92%88)
- [位运算](https://github.com/yihonglei/thinking-in-algorithms#%E4%BD%8D%E8%BF%90%E7%AE%97)
- [前缀和](https://github.com/yihonglei/thinking-in-algorithms#%E5%89%8D%E7%BC%80%E5%92%8C)
- [滑动窗口](https://github.com/yihonglei/thinking-in-algorithms#%E6%BB%91%E5%8A%A8%E7%AA%97%E5%8F%A3)
- [计数](https://github.com/yihonglei/thinking-in-algorithms#%E8%AE%A1%E6%95%B0)
- [状态压缩](https://github.com/yihonglei/thinking-in-algorithms#%E7%8A%B6%E6%80%81%E5%8E%8B%E7%BC%A9)
- [哈希函数](https://github.com/yihonglei/thinking-in-algorithms#%E5%93%88%E5%B8%8C%E5%87%BD%E6%95%B0)
- [滚动哈希](https://github.com/yihonglei/thinking-in-algorithms#%E6%BB%9A%E5%8A%A8%E5%93%88%E5%B8%8C)
- [扫描线](https://github.com/yihonglei/thinking-in-algorithms#%E6%89%AB%E6%8F%8F%E7%BA%BF)

[四、算法模板](https://github.com/yihonglei/thinking-in-algorithms#%E4%B8%80%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84)

- [回溯算法模板]()

[五、Leetcode 题目大全](https://github.com/yihonglei/thinking-in-algorithms#%E4%B8%80%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84)

# 一、数据结构

## 数组

1、数组理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0001|Two Sum(两数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0001)|Easy|
|0011|Container With Most Water(盛最多水的容器)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0011)|Medium|
|0015|3Sum(三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0015)|Medium|
|0016|3Sum Closest(最接近的三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0016)|Medium|
|0018|4Sum(四数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0018)|Medium|
|0026|Remove Duplicates from Sorted Array(删除有序数组中的重复项)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0026)|Easy|
|0027|Remove Element(移除元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0027)|Easy|
|0042|Trapping Rain Water(接雨水)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0042)|Hard|
|0078|Subsets(子集)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0078)|Medium|
|0079|Word Search(单词搜索)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0079)|Medium|
|0209|Minimum Size Subarray Sum(长度最小的子数组)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0209)|Medium|
|0977|Squares of a Sorted Array(有序数组的平方)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0977)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 链表

1、链表理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0019|Remove Nth Node From End of List(删除链表的倒数第 N 个结点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0019)|Medium|
|0024|Swap Nodes in Pairs(两两交换链表中的节点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0024)|Medium|
|0141|Linked List Cycle(环形链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0141)|Easy|
|0142|Linked List Cycle II(环形链表 II)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0142)|Medium|
|0203|Remove Linked List Elements(移除链表元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0203)|Easy|
|0206|Reverse Linked List(反转链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0206)|Easy|
|0707|Design Linked List(设计链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0707)|Medium|
|------|----------------------------------------------------------|---------|---------|--------|

## 栈

1、栈理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0020|Valid Parentheses(有效的括号)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0020)|Easy|
|0150|Evaluate Reverse Polish Notation(逆波兰表达式求值)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0150)|Medium|
|0225|Implement Stack using Queues(用队列实现栈)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0225)|Easy|
|0232|Implement Queue using Stacks(用栈实现队列)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0232)|Easy|
|1047|Remove All Adjacent Duplicates In String(删除字符串中的所有相邻重复项)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode2/n1047)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 队列

1、队列理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0225|Implement Stack using Queues(用队列实现栈)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0225)|Easy|
|0232|Implement Queue using Stacks(用栈实现队列)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0232)|Easy|
|0239|Sliding Window Maximum(滑动窗口最大值)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0239)|Hard|
|0347|Top K Frequent Elements( 前 K 个高频元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0347)|Medium|
|------|----------------------------------------------------------|---------|---------|--------|

## 字符串

1、字符串理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0028|Implement strStr()【实现 strStr()】|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0028)|Easy|
|0344|Reverse String(反转字符串)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0344)|Easy|
|0151|Reverse Words in a String(翻转字符串里的单词)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0151)|Medium|
|0541|Reverse String II(反转字符串 II)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0541)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 哈希表

1、哈希表理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0001|Two Sum(两数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0001)|Easy|
|0009|Palindrome Number(回文数)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0009)|Easy|
|0015|3Sum(三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0015)|Medium|
|0018|4Sum(四数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0018)|Medium|
|0202|Happy Number(快乐数)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0202)|Easy|
|0242|Valid Anagram(有效的字母异位词)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0242)|Easy|
|0349|Intersection of Two Arrays(两个数组的交集)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0349)|Easy|
|0383|Ransom Note(赎金信)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0383)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 树

1、树理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0094|Binary Tree Inorder Traversal(二叉树的中序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0094)|Easy|
|0101|Symmetric Tree(对称二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0101)|Easy|
|0102|Binary Tree Level Order Traversal(二叉树的层序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0102)|Medium|
|0104|Maximum Depth of Binary Tree(二叉树的最大深度)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0104)|Easy|
|0106|Construct Binary Tree from Inorder and Postorder Traversal(从中序与后序遍历序列构造二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0106)|Medium|
|0111|Minimum Depth of Binary Tree(二叉树的最小深度)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0111)|Easy|
|0112|Path Sum(路径总和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0112)|Easy|
|0144|Binary Tree Preorder Traversal(二叉树的前序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0144)|Easy|
|0145|Binary Tree Postorder Traversal(二叉树的后序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0145)|Easy|
|0257|Binary Tree Paths(二叉树的所有路径)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0257)|Easy|
|0404|Sum of Left Leaves(左叶子之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0404)|Easy
|0450|Delete Node in a BST(删除二叉搜索树中的节点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0450)|Medium
|0513|Find Bottom Left Tree Value(找树左下角的值)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0513)|Medium
|0530|Minimum Absolute Difference in BST(二叉搜索树的最小绝对差)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0530)|Easy
|0617|Merge Two Binary Trees(合并二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0617)|Easy|
|0654|Maximum Binary Tree(最大二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0654)|Medium|
|------|----------------------------------------------------------|---------|---------|--------|

## 堆

1、堆理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 跳表

1、跳表理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 并查集

1、并查集理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 线段树

1、线段树理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 树状数组

1、树状数组理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 图

1、图理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

# 二、算法

## 递归

1、递归理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0007|Reverse Integer(整数反转)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0007)|Medium|
|0009|Palindrome Number(回文数)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0009)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 尾递归

1、尾递归理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 排序

1、排序理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 二分查找

1、二分查找理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0704|Binary Search(二分查找)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0704)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 哈希算法

1、哈希算法理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 字符串匹配

1、字符串匹配理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0028|Implement strStr()【实现 strStr()】|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0028)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 搜索

1、搜索理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 随机化

1、随机化理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 图论

1、图论理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 贪心

1、贪心理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 几何

1、几何理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 数论

1、数论理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 矩阵

1、矩阵理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 枚举

1、枚举理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 回溯算法

1、回溯算法理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 动态规划

1、动态规划理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

# 三、算法技巧

## 双指针

1、双指针理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0011|Container With Most Water(盛最多水的容器)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0011)|Medium|
|0015|3Sum(三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0015)|Medium|
|0016|3Sum Closest(最接近的三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0016)|Medium|
|0018|4Sum(四数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0018)|Medium|
|0019|Remove Nth Node From End of List( 删除链表的倒数第 N 个结点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0019)|Medium|
|0026|Remove Duplicates from Sorted Array( 删除有序数组中的重复项)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0026)|Easy|
|0027|Remove Element(移除元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0027)|Easy|
|0141|Linked List Cycle(环形链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0141)|Easy|
|0142|Linked List Cycle II(环形链表 II)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0142)|Medium|
|0151|Reverse Words in a String(翻转字符串里的单词)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0151)|Medium|
|0206|Reverse Linked List(反转链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0206)|Easy|
|0209|Minimum Size Subarray Sum(长度最小的子数组)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0209)|Medium|
|0344|Reverse String(反转字符串)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0344)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|

## 位运算

1、位运算理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 前缀和

1、前缀和理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 滑动窗口

1、滑动窗口理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 计数

1、计数理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 状态压缩

1、状态压缩理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 哈希函数

1、哈希函数理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 滚动哈希

1、滚动哈希理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

## 扫描线

1、扫描线理论

2、经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|TODO|TODO|TODO|
|------|----------------------------------------------------------|---------|---------|--------|

# 四、算法模板

经典题目(leetcode)

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0000|回溯算法模板|[Java](https://github.com/yihonglei/thinking-in-algorithms/blob/master/java/src/main/java/com/jpeony/leetcodecn/ReplaceSpace.java)|Level|
|------|----------------------------------------------------------|---------|---------|--------|

# 五、Leetcode 题目大全

| No | Title | Solution | Difficulty |
|:------:|:------|:------:|:------:|
|0001|Two Sum(两数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0001)|Easy|
|0007|Reverse Integer(整数反转)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0007)|Medium|
|0009|Palindrome Number(回文数)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0009)|Easy|
|0011|Container With Most Water(盛最多水的容器)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0011)|Medium|
|0015|3Sum(三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0015)|Medium|
|0016|3Sum Closest(最接近的三数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0016)|Medium|
|0018|4Sum(四数之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0018)|Medium|
|0019|Remove Nth Node From End of List( 删除链表的倒数第 N 个结点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0019)|Medium|
|0020|Valid Parentheses(有效的括号)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0020)|Easy|
|0024|Swap Nodes in Pairs(两两交换链表中的节点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0024)|Medium|
|0026|Remove Duplicates from Sorted Array( 删除有序数组中的重复项)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0026)|Easy|
|0027|Remove Element(移除元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0027)|Easy|
|0028|Implement strStr()【实现 strStr()】|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0028)|Easy|
|0042|Trapping Rain Water(接雨水)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0042)|Hard|
|0075|Sort Colors(颜色分类)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0075)|Medium|
|0078|Subsets(子集)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0078)|Medium|
|0079|Word Search(单词搜索)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0079)|Medium|
|0084|Largest Rectangle in Histogram(柱状图中最大的矩形)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0084)|Hard|
|0088|Merge Sorted Array(合并两个有序数组)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0088)|Easy|
|0090|Subsets II(子集 II)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0090)|Medium|
|0094|Binary Tree Inorder Traversal(二叉树的中序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0094)|Easy|
|0101|Symmetric Tree(对称二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0101)|Easy|
|0102|Binary Tree Level Order Traversal(二叉树的层序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0102)|Medium|
|0104|Maximum Depth of Binary Tree(二叉树的最大深度)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0104)|Easy|
|0106|Construct Binary Tree from Inorder and Postorder Traversal(从中序与后序遍历序列构造二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0106)|Medium|
|0111|Minimum Depth of Binary Tree(二叉树的最小深度)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0111)|Easy|
|0112|Path Sum(路径总和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0112)|Easy|
|0141|Linked List Cycle(环形链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0141)|Easy|
|0142|Linked List Cycle II(环形链表 II)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0142)|Medium|
|0144|Binary Tree Preorder Traversal(二叉树的前序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0144)|Easy|
|0145|Binary Tree Postorder Traversal(二叉树的后序遍历)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0145)|Easy|
|0150|Evaluate Reverse Polish Notation(逆波兰表达式求值)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0150)|Medium|
|0151|Reverse Words in a String(翻转字符串里的单词)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0151)|Medium|
|0202|Happy Number(快乐数)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0202)|Easy|
|0203|Remove Linked List Elements(移除链表元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0203)|Easy|
|0206|Reverse Linked List(反转链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0206)|Easy|
|0209|Minimum Size Subarray Sum(长度最小的子数组)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0209)|Medium|
|0225|Implement Stack using Queues(用队列实现栈)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0225)|Easy|
|0232|Implement Queue using Stacks(用栈实现队列)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0232)|Easy|
|0239|Sliding Window Maximum(滑动窗口最大值)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0239)|Hard|
|0242|Valid Anagram(有效的字母异位词)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0242)|Easy|
|0257|Binary Tree Paths(二叉树的所有路径)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0257)|Easy|
|0344|Reverse String(反转字符串)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0344)|Easy|
|0347|Top K Frequent Elements( 前 K 个高频元素)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0347)|Medium|
|0349|Intersection of Two Arrays(两个数组的交集)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0349)|Easy|
|0383|Ransom Note(赎金信)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0383)|Easy|
|0404|Sum of Left Leaves(左叶子之和)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0404)|Easy
|0450|Delete Node in a BST(删除二叉搜索树中的节点)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0450)|Medium
|0513|Find Bottom Left Tree Value(找树左下角的值)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0513)|Medium
|0530|Minimum Absolute Difference in BST(二叉搜索树的最小绝对差)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0530)|Easy
|0541|Reverse String II(反转字符串 II)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0541)|Easy|
|0617|Merge Two Binary Trees(合并二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0617)|Easy|
|0654|Maximum Binary Tree(最大二叉树)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0654)|Medium|
|0704|Binary Search(二分查找)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0704)|Easy|
|0707|Design Linked List(设计链表)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0707)|Medium|
|0977|Squares of a Sorted Array(有序数组的平方)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode/n0977)|Easy|
|1047|Remove All Adjacent Duplicates In String(删除字符串中的所有相邻重复项)|[Java](https://github.com/yihonglei/thinking-in-algorithms/tree/master/java/src/main/java/com/jpeony/leetcode2/n1047)|Easy|
|------|----------------------------------------------------------|---------|---------|--------|
