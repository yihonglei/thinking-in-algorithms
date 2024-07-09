package com.jpeony.leetcode1.n0468;

/**
 * [468. Validate IP Address](https://leetcode.com/problems/validate-ip-address/)
 * [468. 验证IP地址](https://leetcode.cn/problems/validate-ip-address/)
 *
 * @author yihonglei
 */
public class N468_ValidateIPAddress {

    public static String validIPAddress(String queryIP) {
        // 字符串为空，返回 Neither
        if (queryIP.equals("")) {
            return "Neither";
        }
        // 判断是否是 IPv4
        if (isIPv4(queryIP)) {
            return "IPv4";
        }
        // 判断是否是 IPv6
        if (isIPv6(queryIP)) {
            return "IPv6";
        }

        return "Neither";
    }

    public static boolean isIPv4(String IP) {
        // 切割数组
        String[] nums = IP.split("\\.", -1);
        if (nums.length != 4) {
            return false;
        }

        for (String x : nums) {
            // 1. check 数字在 1~3 位
            if (x.length() == 0 || x.length() > 3) {
                return false;
            }
            // 2. check '0' 开头
            if (x.startsWith("0") && x.length() != 1) {
                return false;
            }
            // 3. check 是不是数字
            for (char ch : x.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            // 4. check 是否小于 255
            if (Integer.parseInt(x) > 255) {
                return false;
            }
        }

        return true;
    }

    public static boolean isIPv6(String IP) {
        // 切割数组
        String[] nums = IP.split(":", -1);
        if (nums.length != 8) {
            return false;
        }
        // 数字，小写字母 'a' ~ 'f'，大写字母 'A' ~ 'F'
        String hexdigits = "0123456789abcdefABCDEF";
        for (String x : nums) {
            // 1. check 在 1 ~ 4 位
            if (x.length() == 0 || x.length() > 4) {
                return false;
            }
            // 2. 判断每位字符是否符号条件
            for (Character ch : x.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String queryIP = "172.16.254.1";

        String via = validIPAddress(queryIP);
        System.out.println("validIPAddress = " + via);
    }
}
