package com.jpeony;

public class Tmp {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        for (int i = 0; i < 3; i++) {
            b();
            System.out.println("a");
        }
    }

    private static void b() {
        for (int i = 0; i < 3; i++) {
            c();
            System.out.println("b");
        }
    }

    private static void c() {
        System.out.println("c");
    }
}
