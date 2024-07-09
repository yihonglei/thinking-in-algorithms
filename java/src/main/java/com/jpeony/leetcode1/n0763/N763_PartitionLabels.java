package com.jpeony.leetcode1.n0763;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yihonglei
 */
public class N763_PartitionLabels {

    public static List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> integers = partitionLabels(s);

        System.out.println('b' - 'a');

        System.out.println(Arrays.toString(integers.toArray()));
    }
}
