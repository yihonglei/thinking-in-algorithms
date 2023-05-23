package com.jpeony.base.tmp;

import java.util.Arrays;

/**
 * @author yihonglei
 */
public class Tmp {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 1, 3};
        Arrays.sort(arr);
        System.out.println("sort-arr=" + Arrays.toString(arr));
    }
}
