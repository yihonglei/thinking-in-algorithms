# [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## 题目

Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned). 

Example 1:
```
Input: x = 123
Output: 321
```

Example 2:
```
Input: x = -123
Output: -321
```

Example 3:
```
Input: x = 120
Output: 21
```

Constraints:
- -231 <= x <= 231 - 1

## 题目含义

将整数进行反转，注意正负符号位不变。

## 算法思路

【迭代】

![Leetcode-7-ReverseInteger](https://github.com/yihonglei/thinking-in-algorithms/blob/master/images/java/Leetcode-7-ReverseInteger.png)

1、例如 12345 的反转如上图，每次整数的求余等于反转整数的尾数；

2、res * 10 + 反转整数 等于 当前位反转后的反转数；

3、通过 1，2 不断迭代，可以得到整数最终的反转数；

4、注意正负号位标识，对于数的符号反转后要保持不变；

5、注意反转后数组的移出，题目要求的范围 x 是 -231 <= x <= 231 - 1，可以通过 Long 接收反转后的整数，

结果与 Integer 比，如果超过范围，返回 0 即可；

## 复杂度分析

时间复杂度：O(k)。k 为 x 的位数，即迭代次数为 k 次，所以时间复杂度为 O(k)。

空间复杂度：O(1)。只是用了临时变量空间，并没有别的渐进增长空间，所以空间复杂度为 O(1)。