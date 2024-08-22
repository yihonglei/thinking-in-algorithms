package com.jpeony.leetcode1.n0401;

import java.util.ArrayList;
import java.util.List;

/**
 * [401. 二进制手表](https://leetcode.cn/problems/binary-watch)
 */
public class N401_BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<String>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    ans.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<String> strings = readBinaryWatch(1);
        System.out.println(strings);
    }
}
