package com.hillel.stulov.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int resultTeam1 = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 23) + 18;
            resultTeam1 = resultTeam1 + team1[i];
            resultTeam1 = resultTeam1 / 25;
            if (i == team1.length - 1) {
                System.out.print(team1[i]);
            } else {
                System.out.print(team1[i] + " ");
            }
        }
        System.out.println();
        int[] team2 = new int[25];
        int resultTeam2 = 0;
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * 23) + 18;
            resultTeam2 = resultTeam2 + team2[i];
            resultTeam2 = resultTeam2 / 25;
            if (i == team2.length - 1) {
                System.out.print(team2[i]);
            } else {
                System.out.print(team2[i] + " ");
            }
        }
        System.out.println();
        System.out.println( "average score team1 :" + resultTeam1);
        System.out.println("average score team2 :" + resultTeam2);;
    }
}





