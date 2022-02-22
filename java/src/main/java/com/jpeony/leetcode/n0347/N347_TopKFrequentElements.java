package com.jpeony.leetcode.n0347;

import java.util.*;

/**
 * [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
 * [347. 前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/)
 *
 * @author yihonglei
 */
public class N347_TopKFrequentElements {

    /**
     * 【最小堆】
     * 时间复杂度：O(nlogk)。n 为数组的长度，k 堆的数目。
     * 空间复杂度：O(n)。n 为 map 中 key 的个数。
     */
    public static int[] topKFrequent(int[] nums, int k) {
        // 返回结果
        int[] result = new int[k];

        // 频次统计
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        // 根据 map 的 value 值正序排，相当于一个小顶堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // 倒序从小顶堆取值，即为逆向取值
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] res = topKFrequent(nums, k);

        System.out.println("topKFrequent = " + Arrays.toString(res));
    }
}
