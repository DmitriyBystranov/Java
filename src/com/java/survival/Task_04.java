package com.java.survival;

import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {
        int[] array = new int[30];
        Arrays.fill(array, 5);
        for (int i = 0; i < 30; i ++) {
            if (i % 10 == 0)
                System.out.println("");
            System.out.print(array[i] + " ");
        }
    }
}
