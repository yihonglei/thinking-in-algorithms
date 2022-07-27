package com.jpeony.leetcode.n0016;

import java.util.Arrays;

/**
 * [16. 3Sum Closest](https://leetcode.com/problems/3sum-closest/)
 * [16. 最接近的三数之和](https://leetcode.cn.com/problems/3sum-closest/)
 *
 * @author yihonglei
 */
public class N16_3SumClosest {

    /**
     * 【排序 + 双指针】
     * 时间复杂度：O(n^2)。内外两层循环，n * n 为 n^2 次执行，所以时间复杂度为 O(n^2)。
     * 空间复杂度：O(1)。增量空间为临时变量 closestNum，没有别的渐进增长空间，所以空间复杂度为 O(1)。
     */
    private static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);
        int n = nums.length;
        // 初始假设最接近 target 的值
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n; i++) {
            int leftPoint = i + 1;
            int rightPoint = n - 1;
            while (leftPoint < rightPoint) {
                int sum = nums[i] + nums[leftPoint] + nums[rightPoint];
                // 寻找最接近 target 的三元和
                if (Math.abs(sum - target) < Math.abs(closestNum - target)) {
                    closestNum = sum;
                }

                if (sum > target) {// 如果大了，尝试从右边往左边夹逼，有没有更好的解
                    rightPoint--;
                } else if (sum < target) {// 如果小了，尝试从左边往右边夹逼，有没有更好的解
                    leftPoint++;
                } else { // 如果等于 target，必然最接近
                    return sum;
                }
            }
        }

        return closestNum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int ans = threeSumClosest(nums, target);
        System.out.println("threeSumClosest = " + ans);
    }
}
