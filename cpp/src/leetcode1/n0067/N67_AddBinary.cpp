#include "N67_AddBinary.hpp"
/**
 * [67. 移除元素](https://leetcode.cn/problems/remove-element/)
 */
string N67_ADDBINARY::addBinary(string a, string b) {
    string ans;
    reverse(a.begin(), a.end());
    reverse(b.begin(), b.end());

    int n = max(a.size(), b.size()), carry = 0;
    for (size_t i = 0; i < n; ++i) {
        carry += i < a.size() ? (a.at(i) == '1') : 0;
        carry += i < b.size() ? (b.at(i) == '1') : 0;
        ans.push_back((carry % 2) ? '1' : '0');
        carry /= 2;
    }
    if (carry > 0) {
        ans.push_back('1');
    }

    reverse(ans.begin(), ans.end());

    return ans;
}