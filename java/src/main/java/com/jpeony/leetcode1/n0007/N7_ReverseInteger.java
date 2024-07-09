package com.jpeony.leetcode1.n0007;

/**
 * [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)
 * [7. 整数反转](https://leetcode.cn/problems/reverse-integer/)
 *
 * @author yihonglei
 */
public class N7_ReverseInteger {

    /**
     * 【迭代】
     * 时间复杂度：O(k)。k 为 x 的位数，即迭代次数为 k 次，所以时间复杂度为 O(k)。
     * 空间复杂度：O(1)。只是用了临时变量空间，并没有别的渐进增长空间，所以空间复杂度为 O(1)。
     */
    private static int reverse(int x) {
        // 返回值
        long res = 0;
        // 符号位
        int flag = 1;
        if (x < 0) {
            flag = -1;
        }
        // 绝对值
        x = Math.abs(x);
        // 反转
        while (x != 0) {
            int cur = x % 10;
            res = res * 10 + cur;
            x = x / 10;
        }
        // 符号位恢复
        res = res * flag;
        // 超过 Integer 值范围，返回 0，否则，返回反转后的整数
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        int x = 123;
        int reverse = reverse(x);
        System.out.println("reverse = " + reverse);
    }
}
