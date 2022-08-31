package com.jpeony.leetcode.n0042;

/**
 * [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
 * [42. 接雨水](https://leetcode.cn/problems/trapping-rain-water/)
 *
 * @author yihonglei
 */
public class N42_TrappingRainWater {

    /**
     * 【双指针】
     * 时间复杂度：O(n)。循环了 n 次，所以时间复杂度为 O(n)。
     * 空间复杂度：O(1)。临时变量 ans，leftMax，rightMax，并没有渐进增长空间，所以空间复杂度为 O(1)。
     */
    private static int trap(int[] height) {
        // 定义双指针
        int left = 0, right = height.length - 1;
        // 返回结果
        int ans = 0;
        // 构成凹槽左边柱子最大高度，右边柱子最大高度
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            // 当左边柱子小于右边柱子高度时，右边柱子构成凹槽的高度是可信的，只需要移动左边计算凹槽深度
            if (height[left] < height[right]) {
                // 覆盖左边最大值
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // 计算凹槽往下凹的深度，即左边最大值减掉当前高度，即为凹下去的深度，这个时候一定要想象到右柱子是右侧远方"移花接木"过来的。
                    ans += (leftMax - height[left]);
                }
                // 继续往后探寻左边最大值或凹槽深度
                left++;
            } else {// 当左边柱子大于右边柱子高度时，左边柱子构成凹槽的高度是可信的，只需要移动右边计算凹槽深度
                // 覆盖右边最大值
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // 计算凹槽往下凹的深度，即右边最大值减掉当前高度，即为凹下去的深度，这个时候一定要想象到左柱子是左侧远方"移花接木"过来的。
                    ans += (rightMax - height[right]);
                }
                // 继续往前探寻右边最大值或凹槽深度
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(height);
        System.out.println("trap = " + ans);
    }
}
