package com.jpeony.leetcode1.n0093;

import java.util.ArrayList;
import java.util.List;

/**
 * [93. 复原 IP 地址](https://leetcode.cn/problems/restore-ip-addresses/)
 *
 * @author yihonglei
 */
public class N93_RestoreIpAddresses {
    // 回溯算法模板
    //    void backtracking(参数) {
//        if (终止条件) {
//            存放结果;
//            return;
//        }
//-------》循环遍历
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

    public static List<String> restoreIpAddresses(String s) {
        backTracking(s, 0, 0);
        return list;
    }

    // 比如digits如果为"23",num 为0，则str表示2对应的 abc
    public static void backTracking(String s, int startIndex, int pointNum) {
        // 如果startIndex等于s的长度并且ip段的数量是4，则加入结果集，并返回
        if (startIndex == s.length() && pointNum == 4) {
            list.add(temp.toString());
            return;
        }
        // 如果startIndex等于s的长度但是ip段的数量不为4，或者ip段的数量为4但是startIndex小于s的长度，则直接返回
        if (startIndex == s.length() || pointNum == 4) {
            return;
        }
        // 剪枝：ip段的长度最大是3，并且ip段处于[0,255]
        for (int i = startIndex; i < s.length() && i - startIndex < 3 && Integer.parseInt(s.substring(startIndex, i + 1)) >= 0
                && Integer.parseInt(s.substring(startIndex, i + 1)) <= 255; i++) {
            // 如果ip段的长度大于1，并且第一位为0的话，continue
            if (i + 1 - startIndex > 1 && s.charAt(startIndex) - '0' == 0) {
                continue;
            }
            temp.append(s.substring(startIndex, i + 1));
            // 当temp里的网段数量小于3时，才会加点；如果等于3，说明已经有3段了，最后一段不需要再加点
            if (pointNum < 3) {
                temp.append(".");
            }
            pointNum++;
            backTracking(s, i + 1, pointNum);
            pointNum--;
            // 删除当前stringBuilder最后一个网段，注意考虑点的数量的问题
            temp.delete(startIndex + pointNum, i + pointNum + 2);
        }
    }

    public static void main(String[] args) {
        String s = "25525511135";
        restoreIpAddresses(s);
    }
}
