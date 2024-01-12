package com.jpeony.leetcode.n0412;

import java.util.ArrayList;
import java.util.List;

/**
 * [412. Fizz Buzz](https://leetcode.cn/problems/fizz-buzz/)
 *
 * @author yihonglei
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }

            if (i % 5 == 0) {
                sb.append("Buzz");
            }

            if (sb.length() == 0) {
                sb.append(i);
            }

            list.add(sb.toString());
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(10);
        System.out.println(list.toString());
    }
}
