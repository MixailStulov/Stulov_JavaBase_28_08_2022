package com.hillel.stulov.lessons.lesson5;

public class Main {
    public static void main(String[] args) {

        String team1 = "counter-terrorist";
        byte ct_player1 = 5;
        byte ct_player2 = 9;
        byte ct_player3 = 11;
        byte ct_player4 = 6;
        byte ct_player5 = 9;

        String team2 = "terrorist";
        byte t_player1 = 6;
        byte t_player2 = 10;
        byte t_player3 = 7;
        byte t_player4 = 4;
        byte t_player5 = 12;

        double counter_terrorist = ((double) (ct_player1 + ct_player2 + ct_player3 + ct_player4 + ct_player5) / 5);
        double terrorist = ((double) (t_player1 + t_player2 + t_player3 + t_player4 + t_player5) / 5);

        System.out.println(counter_terrorist);
        System.out.println(terrorist);
        System.out.println((counter_terrorist > terrorist) ? "yes" : "no");
        System.out.println("win team =" + (team1) + " skore " + (counter_terrorist) + " points ");

    }
}
