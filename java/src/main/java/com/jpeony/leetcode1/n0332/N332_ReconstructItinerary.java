package com.jpeony.leetcode1.n0332;

import java.util.*;

/**
 * [332. 重新安排行程](https://leetcode.cn/problems/reconstruct-itinerary)
 */
public class N332_ReconstructItinerary {
    private static Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    private static List<String> itinerary = new LinkedList<String>();

    public static List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<String>());
            }
            map.get(src).offer(dst);
        }
        dfs("JFK");
        Collections.reverse(itinerary);
        return itinerary;
    }

    public static void dfs(String curr) {
        while (map.containsKey(curr) && map.get(curr).size() > 0) {
            String tmp = map.get(curr).poll();
            dfs(tmp);
        }
        itinerary.add(curr);
    }

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("MUC");
        list1.add("LHR");
        List<String> list2 = new ArrayList<>();
        list2.add("JFK");
        list2.add("MUC");
        List<String> list3 = new ArrayList<>();
        list3.add("SFO");
        list3.add("SJC");
        List<String> list4 = new ArrayList<>();
        list4.add("LHR");
        list4.add("SFO");

        tickets.add(list1);
        tickets.add(list2);
        tickets.add(list3);
        tickets.add(list4);

        List<String> itinerary = findItinerary(tickets);
        System.out.println("itinerary=" + itinerary);
    }
}
