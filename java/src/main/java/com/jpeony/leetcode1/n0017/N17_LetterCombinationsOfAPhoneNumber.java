package com.jpeony.leetcode1.n0017;

import java.util.ArrayList;
import java.util.List;

/**
 * [17. 电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/)
 *
 * @author yihonglei
 */
public class N17_LetterCombinationsOfAPhoneNumber {
    //    void backtracking(参数) {
//        if (终止条件) {
//            存放结果;
//            return;
//        }
//
//        for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
//            处理节点;
//            backtracking(路径，选择列表); // 递归
//            回溯，撤销处理结果
//        }
//    }
    // 设置全局列表存储最后的结果
    static List<String> list = new ArrayList<>();
    // 每次迭代获取一个字符串，所以会设计大量的字符串拼接，所以这里选择更为高效的 StringBuild
    static StringBuilder temp = new StringBuilder();

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        // 初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // 迭代处理
        backTracking(digits, numString, 0);
        return list;
    }

    // 比如digits如果为"23",num 为0，则str表示2对应的 abc
    public static void backTracking(String digits, String[] numString, int num) {
        // 遍历全部一次记录一次得到的字符串
        if (num == digits.length()) {
            list.add(temp.toString());
            return;
        }
        // str 表示当前num对应的字符串
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            temp.append(c);
            // c
            backTracking(digits, numString, num + 1);
            // 剔除末尾的继续尝试
            temp.deleteCharAt(temp.length() - 1);
        }
    }


    public static void main(String[] args) {
        String digits = "23";
        letterCombinations(digits);
    }
}
