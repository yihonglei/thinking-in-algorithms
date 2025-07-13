package com.jpeony.leetcode4.n3304;

public class N3304_find_the_k_th_character_in_string_game_i {
    public static char kthCharacter(int k) {
        char[] init = new char[]{'a'};
        init[1]= 'd';
        init[2] = 'a';
        return '0';
    }

    public static void main(String[] args) {
        char c = kthCharacter(5);
        System.out.println(c);
    }
}
