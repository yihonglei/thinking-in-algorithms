package com.jpeony;

import java.util.HashMap;

public class Tmp {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        char key = 'k';
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
}
