package com.jpeony.leetcode.n0146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * [146. LRU Cache](https://leetcode.com/problems/lru-cache/)
 * [146. LRU 缓存](https://leetcode-cn.com/problems/lru-cache/)
 *
 * @author yihonglei
 */
public class N146_LRUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public N146_LRUCache(int capacity) {
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
        N146_LRUCache obj = new N146_LRUCache(10);

    }
}
