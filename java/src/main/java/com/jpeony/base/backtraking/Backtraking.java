package com.jpeony.base.backtraking;

import java.util.*;

/**
 * 回溯求满足条件的组合
 */
public class Backtraking {
    // 每次迭代结果
    private static Stack<Integer> stack = new Stack<>();

    private static List<List<Integer>> combine(List<Integer> carPoolingList, int targetNum) {
        // 组合结果收集
        List<List<Integer>> combinations = new ArrayList<>();

        combineRecursion(carPoolingList, targetNum, 0, 0, combinations);
        return combinations;
    }

    private static void combineRecursion(List<Integer> carPoolingList,
                                         int targetNum,
                                         int size,
                                         int currentIndex,
                                         List<List<Integer>> combinations) {
        if (size == targetNum) {
            List<Integer> matchFriendList = new ArrayList<>(stack);
            combinations.add(matchFriendList);
            return;
        }

        for (int i = currentIndex; i < carPoolingList.size(); i++) {
            if (!stack.toString().contains(carPoolingList.get(i).toString())) {
                stack.add(carPoolingList.get(i));
                combineRecursion(carPoolingList, targetNum, size + 1, i, combinations);
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        // 集合
        List<Integer> carPoolingList = new ArrayList<>();
        carPoolingList.add(1);
        carPoolingList.add(2);
        carPoolingList.add(3);
        carPoolingList.add(4);
        System.out.println("removeAll-before:" + carPoolingList);

        // 组合
        for (int targetNum = 3; targetNum > 0; targetNum--) {
            List<List<Integer>> combines = combine(carPoolingList, targetNum);
            System.out.println("combine-result:" + combines);
            // 计算符合条件的组合，todo
            // 假设组合了 1，2，3
            List<Integer> sub = new ArrayList<>();
            sub.add(1);
            sub.add(2);
            sub.add(3);
            // 移出已经组合了的
            carPoolingList.removeAll(sub);
            System.out.println("removeAll-after:" + carPoolingList);
        }
    }

}
