package com.jpeony.leetcode.n0239;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * [239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)
 * [239. 滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/)
 *
 * @author yihonglei
 */
public class N239_SlidingWindowMaximum {

    /**
     * 暴力求解，Leetcode 上测试大数据量超时了！
     *
     * 时间复杂度：O(n*k)
     */
    public static int[] maxSlidingWindowForce(int[] nums, int k) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int max = Integer.MIN_VALUE;
        int len = nums.length;

        int leftPoint = 0;
        int rightPoint = k - 1;

        while (rightPoint < len) {
            int tempStart = leftPoint;
            int tempEnd = rightPoint;
            while (tempStart <= tempEnd) {
                max = Math.max(max, nums[tempStart]);
                tempStart++;
            }

            stack.push(max);
            max = Integer.MIN_VALUE;
            leftPoint++;
            rightPoint++;
        }

        int[] res = new int[stack.size()];
        int tempLen = stack.size() - 1;
        for (; tempLen >= 0; tempLen--) {
            res[tempLen] = stack.pop();
        }

        return res;
    }

    /**
     * 【单调队列】
     * 时间复杂度：O(n)。n 为数组 nums 长度。
     * 空间复杂度：O(k)。k 为窗口子数组的长度。
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        Deque<Integer> deque = new LinkedList<Integer>();

        // 第一个窗口子数组放入队列
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] res = new int[len - k + 1];
        res[0] = nums[deque.peekFirst()];
        for (int i = k; i < len; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            // 尾部增加移动元素
            deque.offerLast(i);
            // 头部移出元素
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            res[i - k + 1] = nums[deque.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);

        System.out.println("maxSlidingWindow = " + Arrays.toString(res));
    }
}
