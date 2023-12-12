package com.jpeony.leetcode.n0118;

import java.util.ArrayList;
import java.util.List;

/**
 * [118. 杨辉三角](https://leetcode.cn/problems/pascals-triangle/description/)
 */
public class N118_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // 当前层列表
            List<Integer> cur = new ArrayList<>();
            if (i == 0) {
                cur.add(1);
            } else {
                for (int j = 0; j <= i; j++) {
                    // 当前层起点和终点位置元素
                    if (j == 0 || j == i) {
                        cur.add(1);
                    } else {
                        // 上一层列表
                        List<Integer> preList = res.get(i - 1);
                        // 左上角或者右上角两两求和产生下层元素
                        int sumTwo = preList.get(j - 1) + preList.get(j);
                        cur.add(sumTwo);
                    }
                }
            }
            res.add(cur);
        }

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        for (List<Integer> child : generate) {
            System.out.println(child.toString());
        }
    }
}
