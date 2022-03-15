# [148. Sort List](https://leetcode.com/problems/sort-list/)

## 题目

Given the head of a linked list, return the list after sorting it in ascending order.

Example 1:
```
Input: head = [4,2,1,3]
Output: [1,2,3,4]
```

Example 2:
```
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
```

Example 3:
```
Input: head = []
Output: []
```

Constraints:
- The number of nodes in the list is in the range [0, 5 * 104].
- -105 <= Node.val <= 105

## 题目含义

判断链表是否有环，无环返回 false，有环返回 true。

## 算法思路

【自顶向下归并排序】

1、找到链表的中点，以中点为分解，将链表拆分成两个子链表。寻找链表的中点可以使用快慢指针的做法，
快指针每次移动 2 步，慢指针每次移动 1 步，当快指针到达链表末尾时，慢指针指向的链表节点即为链表的中点。

2、对两个子链表分别排序。

3、将两个排序后的子链表合并，得到完整的排序后的链表。

递归的终止条件是链表的节点个数小于或等于 1，即当链表为空或者链表只包含 1 个节点时，不需要对链表进行拆分和排序。

【自底向上归并排序】

使用自底向上的方法实现归并排序，则可以达到 O(1) 的空间复杂度。

1、首先求得链表的长度 length，然后将链表拆分成子链表进行合并。
用 subLength 表示每次需要排序的子链表的长度，初始时 subLength=1。

2、每次将链表拆分成若干个长度为 subLength 的子链表（最后一个子链表的长度可以小于 subLength），按照每两个子链表一组进行合并，
合并后即可得到若干个长度为 subLength×2 的有序子链表（最后一个子链表的长度可以小于 subLength×2）。

3、将 subLength 的值加倍，重复第 2 步，对更长的有序子链表进行合并操作，直到有序子链表的长度大于或等于 length，整个链表排序完毕。

如何保证每次合并之后得到的子链表都是有序的呢？可以通过数学归纳法证明。
初始时 subLength=1，每个长度为 1 的子链表都是有序的。
如果每个长度为 subLength 的子链表已经有序，合并两个长度为 subLength 的有序子链表，得到长度为 subLength×2 的子链表，一定也是有序的。
当最后一个子链表的长度小于 subLength 时，该子链表也是有序的，合并两个有序子链表之后得到的子链表一定也是有序的。

因此可以保证最后得到的链表是有序的。

## 复杂度分析

时间复杂度：O(n)。n 为链表长度。

空间复杂度：O(1)。在原链表上操作，不需要额外空间。