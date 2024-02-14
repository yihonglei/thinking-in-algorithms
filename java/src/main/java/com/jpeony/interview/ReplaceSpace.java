package com.jpeony.interview;

/**
 * @author yihonglei
 */
public class ReplaceSpace {
    public static String replaceSpace(String s) {
        int len = s.length();
        // 声明临时数组
        char[] arr = new char[len * 3];
        // 数组元素个数
        int size = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            }
        }
        return new String(arr, 0, size);
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println("sBefore = " + s);

        String sAfter = replaceSpace(s);
        System.out.println("sAfter = " + sAfter);
    }
}
