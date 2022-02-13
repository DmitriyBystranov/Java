package com.java.survival;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
