package com.jpeony.leetcode1.n0435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * [435. 无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals/)
 */
public class N435_NonOverLappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
                continue;
            } else {
                count++;
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int i = eraseOverlapIntervals(intervals);
        System.out.println("i = " + i);
    }
}
