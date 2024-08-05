package com.jpeony.template;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 【回溯算法模板】
 *
 * @author yihonglei
 */
public class BackTrackingTemplate {
    // 递归终止条件
    // for 循环
    // 递归
    // 想象成树结构
    // 结果收集
    // 处理结点撤销
    // 返回结果
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        list.stream().mapToInt(Integer::intValue).toArray();
    }
}
