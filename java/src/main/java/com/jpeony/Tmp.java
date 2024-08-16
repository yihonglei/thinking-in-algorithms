package com.jpeony;

public class Tmp {
    public static void main(String[] args) {
        int num = 1775;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int b = num % 2;
            sb.append(b);
            num = num / 2;
        }

        System.out.println(sb.reverse().toString());
    }
}
