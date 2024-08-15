package com.jpeony.leetcode1.n0784;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [784. 字母大小写全排列](https://leetcode.cn/problems/letter-case-permutation)
 */
public class N784_LetterCasePermutation {
    public static List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<String>();
        dfs(s.toCharArray(), 0, ans);
        return ans;
    }

    public static void dfs(char[] arr, int pos, List<String> res) {
        while (pos < arr.length && Character.isDigit(arr[pos])) {
            pos++;
        }

        if (pos == arr.length) {
            res.add(new String(arr));
            return;
        }

        arr[pos] ^= 32;
        dfs(arr, pos + 1, res);
        arr[pos] ^= 32;
        dfs(arr, pos + 1, res);
    }

    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(Arrays.toString(letterCasePermutation(s).toArray()));
    }
}
