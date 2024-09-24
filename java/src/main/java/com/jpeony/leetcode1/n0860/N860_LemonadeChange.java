package com.jpeony.leetcode1.n0860;

/**
 * [860. 柠檬水找零](https://leetcode.cn/problems/lemonade-change)
 */
public class N860_LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int m : bills) {
            if (m == 5) {
                five++;
            }

            if (m == 10) {
                five--;
                ten++;
            }

            if (m == 20) {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }

            if (five < 0 || ten < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        boolean b = lemonadeChange(bills);
        System.out.println("b = " + b);
    }
}
