package com.jpeony.leetcode1.n0228;

import java.util.ArrayList;
import java.util.List;

/**
 * [228. 汇总区间](https://leetcode.cn/problems/summary-ranges)
 */
public class N228_SummaryRanges {
    // 模拟
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; ++i) {
            // 顺序增加的状态，第一个值作为区间的起点
            if (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                if (sb.length() == 0) {
                    sb.append(nums[i]);
                }
            } else { // 当不是增加的状态，该值作为区间的结束点，涵盖单个值作为一个区间的情况
                if (sb.length() > 0) {
                    sb.append("->");
                }
                sb.append(nums[i]);
                ans.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> strings = summaryRanges(nums);
        System.out.println(strings.toString());
    }
}
