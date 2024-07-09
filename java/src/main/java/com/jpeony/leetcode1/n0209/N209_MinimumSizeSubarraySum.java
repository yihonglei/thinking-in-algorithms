package com.jpeony.leetcode1.n0209;

/**
 * [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)
 * [209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/)
 *
 * @author yihonglei
 */
public class N209_MinimumSizeSubarraySum {

    /**
     * 【滑动窗口】
     * 时间复杂度：O(n)。整个数组的遍历次数 n。
     * 空间复杂度：O(1)。临时变量空间 ans。
     */
    private static int minSubArrayLen(int target, int[] nums) {
        // 如果数组为空，直接返回0
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        // 返回结果变量声明
        int ans = Integer.MAX_VALUE;
        // 左右指针声明，分别指向数组开始位置
        int left = 0, right = 0;
        // 子数组之和
        int sum = 0;
        while (right < n) {
            // 默认数组第一个元素为第一个子数组，之后依次求子数组
            sum += nums[right];
            // 如果子数组的和大于等于 target，则求最小子数组
            while (sum >= target) {
                // right - left + 1 为子数组的长度
                ans = Math.min(ans, right - left + 1);
                // 移动左指针，是进行最小子数组的逼近
                sum -= nums[left++];
            }
            // 如果 sum < target，则需要继续往后移动，拉一位进来参与子数组之和运算
            right++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int ans = minSubArrayLen(target, nums);
        System.out.println("minSubArrayLen = " + ans);
    }
}
