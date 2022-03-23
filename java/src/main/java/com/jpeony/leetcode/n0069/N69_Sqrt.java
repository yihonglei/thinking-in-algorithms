package com.jpeony.leetcode.n0069;

/**
 * [69. Sqrt(x)](https://leetcode.com/problems/sqrtx/)
 * [69. x 的平方根 ](https://leetcode-cn.com/problems/sqrtx/)
 *
 * @author yihonglei
 */
public class N69_Sqrt {

    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 4;

        int sqrt = mySqrt(x);
        System.out.println("mySqrt = " + sqrt);
    }
}
