package com.hillel.stulov.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int LENGHT = 25;
        int[] team1 = new int[LENGHT];
        int sum1 = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 23) + 18;
            sum1 += team1[i];
            if (i == team1.length - 1) {
                System.out.print(team1[i]);
            } else {
                System.out.print(team1[i] + " ");
            }
        }
        System.out.println();
        int[] team2 = new int[25];
        int sum2 = 0;
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * 23) + 18;
            sum2 += team2[i];
            if (i == team2.length - 1) {
                System.out.print(team2[i]);
            } else {
                System.out.print(team2[i] + " ");
            }
        }
        System.out.println();
        System.out.println( "average score team1 :" + sum1/LENGHT);
        System.out.println("average score team2 :" + sum2/LENGHT);
        System.out.println(" ");
    }
}





