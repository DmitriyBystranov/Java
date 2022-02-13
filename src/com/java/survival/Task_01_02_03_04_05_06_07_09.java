package com.java.survival;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task_01_02_03_04_05_06_07_09 {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task_01();
        task_02();
        task_03();
        task_04();
        task_05();
        task_06();
        task_07();
        task_09();
    }

    public static void task_01() {
        System.out.println("Task_01\n");
        System.out.println("Hello World!\n");
    }

    public static void task_02() {
        System.out.println("\nTask_02\n");
        int a = 4;
        float b = 3.14f;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void task_03() {
        System.out.println("\nTask_03\n");
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
    }

    public static void task_04() {
        System.out.println("\nTask_04\n");
        int[] array = new int[30];
        Arrays.fill(array, 5);
        for (int i = 0; i < 30; i ++) {
            if (i % 10 == 0)
                System.out.println("");
            System.out.print(array[i] + " ");
        }

    }

    public static void task_05() {
        System.out.println("\nTASK_05\n");

        char[] symbols = "Hello World!".toCharArray();

        for (char i : symbols)
            System.out.println(i + " " + (int) i);
    }

    public static void task_06() {
        System.out.println("\nTASK_06\n");
        String str = " Hello World! ";

        Map<String, Integer> res = new HashMap<>();
        Arrays.stream(str.split("")).forEach(x -> {
            res.put(x, res.computeIfAbsent(x, v -> 0) + 1);
        });
        res.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
    }

    public static void task_07() {
        System.out.println("\nTASK_07\n");

        String option_1 = "бутылок стояло";
        String option_2 = "бутылки стояли";
        String option_3 = "бутылка стояла";
        int counter = 100;
        String temp;

        do {
            while (counter < 20 && counter > 4) {
                System.out.println(counter + " " + option_1 + " на столе, одна из них упала и разбилась.");
                counter--;
            }
            int remainderDiv = counter % 10;

            if (remainderDiv > 4 || remainderDiv == 0)
                temp = option_1;
            else if (remainderDiv != 1)
                temp = option_2;
            else temp = option_3;
            System.out.println(counter + " " + temp + " на столе, одна из них упала и разбилась.");
            counter--;
        } while (counter > 0);
    }

    public static void task_09() {
        System.out.println("\nTASK_09\n");

        String[] symbols = scanner.nextLine().replaceAll(" ", "").split("");

        for (int i = 0; i < symbols.length / 2; i++) {
            if (!(symbols[i].equalsIgnoreCase(symbols[symbols.length - 1 - i]))) {
                System.out.println("Это не палиндром");
                return;
            }
        }
        System.out.println("Это палиндром");
    }
}

