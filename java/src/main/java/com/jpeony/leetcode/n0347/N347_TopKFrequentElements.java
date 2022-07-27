package com.jpeony.leetcode.n0347;

import java.util.*;

/**
 * [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
 * [347. 前 K 个高频元素](https://leetcode.cn.com/problems/top-k-frequent-elements/)
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

        // 遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });

        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }

        // 取出最小堆中的元素
        for (int i = 0; i < k; i++) {
            result[i] = pq.remove();
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
