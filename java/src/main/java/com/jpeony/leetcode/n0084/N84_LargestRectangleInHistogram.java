package com.jpeony.leetcode.n0084;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)
 * [84. 柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/)
 *
 * @author yihonglei
 */
public class N84_LargestRectangleInHistogram {

    /**
     * 【单调栈】
     * 时间复杂度：O(n)。
     * 空间复杂度：O(n)。
     */
    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return heights[0];
        }
        // 在原数组前后新增哨兵节点，保证栈里的值都能够出栈，计算柱型面积
        int[] newHeights = new int[n + 2];
        newHeights[0] = 0;
        System.arraycopy(heights, 0, newHeights, 1, n);
        newHeights[n + 1] = 0;
        heights = newHeights;
        n += 2;

        // 初始化柱型的最大面积
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        // 先放入哨兵，在循环里面不需要判断栈是否为空，简化代码逻辑
        stack.addLast(0);
        for (int i = 1; i < n; i++) {
            // stack.peekLast() 获取栈顶元素
            // stack.pollLast() 获取栈顶元素并出栈
            while (heights[i] < heights[stack.peekLast()]) {
                int high = heights[stack.pollLast()];
                int width = i - stack.peekLast() - 1;
                int curArea = high * width;
                maxArea = Math.max(maxArea, curArea);
            }
            stack.addLast(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int largest = largestRectangleArea(heights);
        System.out.println("largestRectangleArea = " + largest);
    }
}
