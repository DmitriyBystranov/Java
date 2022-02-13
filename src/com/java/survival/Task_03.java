package com.java.survival;

public class Task_03 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a && a);
        System.out.println(b && b);
        System.out.println(b || b);
        System.out.println(a || a);

        System.out.println(!a && !b);
        System.out.println(!a || !b);
        System.out.println(!a && !a);
        System.out.println(!b && !b);
        System.out.println(!b || !b);
        System.out.println(!a || !a);

        System.out.println(!a && b);
        System.out.println(!a || b);
        System.out.println(!a && a);
        System.out.println(!b && b);
        System.out.println(!b || b);
        System.out.println(!a || a);

        System.out.println(a && !b);
        System.out.println(a || !b);
        System.out.println(a && !a);
        System.out.println(b && !b);
        System.out.println(b || !b);
        System.out.println(a || !a);

        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);
    }
}
