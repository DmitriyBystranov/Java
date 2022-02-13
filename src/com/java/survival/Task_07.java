package com.java.survival;

public class Task_07 {
    public static void main(String[] args) {
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
}
