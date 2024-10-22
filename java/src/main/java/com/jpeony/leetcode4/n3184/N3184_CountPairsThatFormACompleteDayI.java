package com.jpeony.leetcode4.n3184;

/**
 * [3184.构成从整天的下标对数目I](https://leetcode.cn/problems/count-pairs-that-form-a-complete-day-i)
 */
public class N3184_CountPairsThatFormACompleteDayI {
    public static int countCompleteDayPairs(int[] hours) {
        final int H = 24;
        int ans = 0;
        int[] cnt = new int[H];
        for (int t : hours) {
            // 先查询 cnt，再更新 cnt，因为题目要求 i < j
            // 如果先更新，再查询，就把 i = j 的情况也考虑进去了
            ans += cnt[(H - t % H) % H];
            cnt[t % H]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] hours = {12, 12, 30, 24, 24};
        int i = countCompleteDayPairs(hours);
        System.out.println(i);
    }
}
