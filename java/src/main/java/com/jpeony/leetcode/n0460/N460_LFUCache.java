package com.jpeony.leetcode.n0460;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * [460. LFU Cache](https://leetcode.com/problems/lfu-cache/)
 * [460. LFU 缓存](https://leetcode-cn.com/problems/lfu-cache/)
 *
 * @author yihonglei
 */
public class N460_LFUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public N460_LFUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        N460_LFUCache obj = new N460_LFUCache(10);

    }
}
