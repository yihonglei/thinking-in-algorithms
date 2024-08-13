package com.jpeony.leetcode1.n0168;

/**
 * [168. Excel表列名称](https://leetcode.cn/problems/excel-sheet-column-title)
 */
public class N168_ExcelSheetColumnTitle {
    public static String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder();
        while (cn > 0) {
            cn--;
            sb.append((char) (cn % 26 + 'A'));
            cn /= 26;
        }

        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = convertToTitle(701);
        System.out.println("s = " + s);
    }
}
