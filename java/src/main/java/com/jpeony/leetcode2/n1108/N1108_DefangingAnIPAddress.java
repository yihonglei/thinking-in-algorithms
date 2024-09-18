package com.jpeony.leetcode2.n1108;

/**
 * [1108. IP 地址无效化](https://leetcode.cn/problems/defanging-an-ip-address)
 */
public class N1108_DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
