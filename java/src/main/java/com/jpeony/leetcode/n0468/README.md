# [468. Validate IP Address](https://leetcode.com/problems/validate-ip-address/)

## 题目

Given a string queryIP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address 
or "Neither" if IP is not a correct IP of any type.

A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. 
For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses but "192.168.01.1", 
while "192.168.1.00" and "192.168@1.1" are invalid IPv4 addresses.

A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:
- 1 <= xi.length <= 4
- xi is a hexadecimal string which may contain digits, lower-case English letter ('a' to 'f') and upper-case English letters ('A' to 'F').
- Leading zeros are allowed in xi.

For example, 
"2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses, 
while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addresses.

Example 1:
```
Input: queryIP = "172.16.254.1"
Output: "IPv4"
Explanation: This is a valid IPv4 address, return "IPv4".
```

Example 2:
```
Input: queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
Output: "IPv6"
Explanation: This is a valid IPv6 address, return "IPv6".
```

Example 3:
```
Input: queryIP = "256.256.256.256"
Output: "Neither"
Explanation: This is neither a IPv4 address nor a IPv6 address.
```

Constraints:
- queryIP consists only of English letters, digits and the characters '.' and ':'.

## 题目含义

判断给定 ip 是 IPv4 还是 IPv6。

## 算法思路

【模拟法】

1、判断 ip 是否为空，如果为空，直接返回 Neither；

2、isIPv4() 判断 ip 是否是 IPv4，IPv4 需要同时满足如下条件：
- 按 . 分割为字符串数组长度为 4；
- 不能以 '0' 开头；
- 数组中每个字符串必须为数字；
- 数字不能大于 255；

3、isIPv6() 判断 ip 是否是 IPv6，IPv6 需要同时满足如下条件：
- 按 : 分割为字符串数组长度为 8；
- 数组每位长度为 4；
- 每个元素只能包含 '0123456789abcdefABCDEF' 范围的内的字符，超出就不满足条件；

## 复杂度分析

时间复杂度：O(1)。

空间复杂度：O(1)。