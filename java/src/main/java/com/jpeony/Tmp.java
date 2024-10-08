package com.jpeony;

public class Tmp {
    public static final String BO = "B";
    public static String env = "O";
    public static void main(String[] args) {
       String s = "";
        String b0 = Long.parseLong(s.replace(BO+env, "")) + "";
        System.out.println(b0);
    }
}
