package com.jpeony.leetcode.n0119;

import java.util.ArrayList;
import java.util.List;

/**
 * [119. 杨辉三角 II](https://leetcode.cn/problems/pascals-triangle-ii/description/)
 */
public class N119_PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        // 上一层列表
        List<Integer> pre = new ArrayList<>();
        // 杨辉三角形
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> cur = new ArrayList<>();
            if (i == 0) {
                cur.add(1);
            } else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        cur.add(1);
                    } else {
                        cur.add(pre.get(j) + pre.get(j - 1));
                    }
                }
            }
            pre = cur;
        }

        return pre;
    }

    public static void main(String[] args) {
        List<Integer> getRow = getRow(5);
        System.out.println("getRow = " + getRow.toString());
    }
}
