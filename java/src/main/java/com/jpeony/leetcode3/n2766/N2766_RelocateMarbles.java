package com.jpeony.leetcode3.n2766;

import java.util.*;

/**
 * [2766. 重新放置石块](https://leetcode.cn/problems/relocate-marbles)
 */
public class N2766_RelocateMarbles {
    public static List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, true);
        }
        for (int i = 0; i < moveFrom.length; i++) {
            int removeValue = moveFrom[i];
            int addValue = moveTo[i];
            map.remove(removeValue);
            map.put(addValue, true);
        }
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            res.add(entry.getKey());
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3};
        int[] moveFrom = {1, 3};
        int[] moveTo = {2, 2};

        List<Integer> integers = relocateMarbles(nums, moveFrom, moveTo);
        System.out.println("integers = " + integers.toString());
    }
}
