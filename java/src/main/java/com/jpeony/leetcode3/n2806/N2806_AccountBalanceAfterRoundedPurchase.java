package com.jpeony.leetcode3.n2806;

/**
 * [2806. 取整购买后的账户余额](https://leetcode.cn/problems/account-balance-after-rounded-purchase)
 */

public class N2806_AccountBalanceAfterRoundedPurchase {

    // 分类讨论
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = 0;
        int mod = purchaseAmount % 10;
        if (mod < 5) {// 取下线
            roundedAmount = (purchaseAmount / 10) * 10;
        } else {// 取上线
            roundedAmount = ((purchaseAmount / 10) + 1) * 10;
        }
        return 100 - roundedAmount;
    }

    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(3));
    }
}
