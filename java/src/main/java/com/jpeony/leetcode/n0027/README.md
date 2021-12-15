# [27. Remove Element](https://leetcode.com/problems/remove-element/)

## 题目

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of
the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed
in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the
first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra
memory.

Custom Judge:
The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
// It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
assert nums[i] == expectedNums[i];
}
```

Example 1:

```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Example 2:

```
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Constraints:

```
0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
```

## 题目含义

原地移出数组中给定元素值，返回新数组的长度。

## 算法思路

双指针解题技巧，左右指针指向数组初始位置，右指针负责一直寻找数组中的非给定值，
左指针负责从数组开始位置依次放置，直到右指针完成整个数组遍历为止。

## 复杂度分析

时间复杂度：O(n)。数组遍历一遍，数组长度为 n，所以时间复杂度为 O(n)。

空间复杂度：O(1)。算法额外增加的空间为存储临时变量固定空间，所以空间复杂度为 O(1)。
