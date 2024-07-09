# [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 题目

Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, 
then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be accepted.

Example 1:

```
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Example 2:

```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Constraints:

```
0 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
```

## 题目含义

原地删除数组有序数组中重复元素，返回去重后数组的长度，空间复杂度只能是 O(1)。

## 算法思路

双指针解题技巧，左指针初始位置 0，右指针初始位置 1，左右指针位置数据对比，
如果右指针数据和左指针数据不一样， 右指针覆盖掉左指针下个坐标位置元素，
循环完整个数组为止。不要考虑最终去重后数组右侧多余的数据，
最后主要关注数组左侧左指针重新赋值的数据部分，未重新赋值的忽略。

## 复杂度分析

时间复杂度：O(n)。数组循环了 n 次，n 为数组的长度，所以时间复杂度为 O(n)。

空间复杂度：O(1)。整个算法过程中，增量空间为存储指针位置的临时空间，没有增长趋势，
并没有数据规模增大，空间增大，所以空间复杂度为 O(1)。
