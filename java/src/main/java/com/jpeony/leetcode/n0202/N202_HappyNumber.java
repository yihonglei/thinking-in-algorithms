package com.jpeony.leetcode.n0202;

import java.util.Arrays;
import java.util.HashSet;

/**
 * [202. 快乐数](https://leetcode.cn/problems/happy-number/)
 * [202. Happy Number](https://leetcode.com/problems/happy-number/)
 *
 * @author yihonglei
 */
public class N202_HappyNumber {

    /**
     * 【迭代】
     * 时间复杂度：O(logn)。时间复杂度取决于每次平方求和计算后的数值位数。
     * 空间复杂度：O(logn)。存入哈希的元素个数。
     */
    private static boolean isHappy(int n) {
        if (n < 0) {
            return false;
        }

        // 检测是否出现环形，如果出现环形，返回 false，否则一直找下去，直到找到平方和为 1 的数
        HashSet<Integer> records = new HashSet<>();
        while (n != 1 && !records.contains(n)) {
            records.add(n);
            n = getNextNumber(n);
        }

        return n == 1;
    }

    private static int getNextNumber(int n) {
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean isHappy = isHappy(n);
        System.out.println("isHappy = " + isHappy);
    }
}
