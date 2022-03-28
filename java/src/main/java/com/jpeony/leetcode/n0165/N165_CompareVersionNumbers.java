package com.jpeony.leetcode.n0165;

/**
 * [165. Compare Version Numbers](https://leetcode.com/problems/compare-version-numbers/)
 * [165. 比较版本号](https://leetcode-cn.com/problems/compare-version-numbers/)
 *
 * @author yihonglei
 */
public class N165_CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");

        int l = Math.max(a1.length, a2.length);
        for (int i = 0; i < l; i++) {
            int num1 = i < a1.length ? Integer.parseInt(a1[i]) : 0;
            int num2 = i < a2.length ? Integer.parseInt(a2[i]) : 0;
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "0.1";
        String version2 = "1.1";

        int version = compareVersion(version1, version2);
        System.out.println("compareVersion = " + version);
    }
}
