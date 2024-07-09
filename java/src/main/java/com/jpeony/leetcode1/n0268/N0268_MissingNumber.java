package com.jpeony.leetcode1.n0268;

/**
 * [268. Missing Number](https://leetcode.com/problems/missing-number/)
 * [268. 丢失的数字](https://leetcode.cn/problems/missing-number/)
 *
 * @author yihonglei
 */
public class N0268_MissingNumber {

    public static int missingNumber(int[] nums) {
        // 哈希表，时间 O(n)，空间 O(n)
//        Set<Integer> set = new HashSet<>();
//        int n = nums.length;
//        // 所有值放在 hash 表里面
//        for (int i = 0; i < n; i++) {
//            set.add(nums[i]);
//        }
//        // 从 0 到 n，判断每个值是否在 hash 表里出现，未出现的就是缺失数据
//        for (int i = 0; i<= n; i++) {
//            if (!set.contains(i)) {
//                return i;
//            }
//        }
//
//        return -1;

        // 数学方法，时间 O(n)，空间 O(1)
        int n = nums.length;
        int total = n * (n + 1) / 2; // 从 0 到 n 的全部数之和为 total，通过高斯求和公式计算
        int arrSum = 0;// 实际数组的和
        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
        }
        return total - arrSum;// 差额就为丢失的数字
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, 1};
        int res = missingNumber(nums);
        System.out.println("res = " + res);
    }
}
