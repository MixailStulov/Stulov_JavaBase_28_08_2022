package com.hillel.stulov.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int player[] = new int[7];
        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(player);

        int company[] = new int[7];
        for (int i = 0; i < company.length; i++) {
            company[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(company);

        System.out.print(Arrays.toString(player));
        System.out.println("");
        System.out.print(Arrays.toString(company));

        int counter = 0;
        for (int i = 0; i < company.length; i++) {
            if (player[i] == company[i]) counter++;
        }
        System.out.println();
        System.out.println("overlap: " + counter);
    }
}


