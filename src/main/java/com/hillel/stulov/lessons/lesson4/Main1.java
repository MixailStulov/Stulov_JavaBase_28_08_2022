package com.hillel.stulov.lessons.lesson4;

public class Main1 {
    public static void main(String[] args) {

        byte li_warriors_damage = 13;
        byte lI_archers_damage = 24;
        byte li_cavalry_damage = 46;
        byte ming_warriors_damage = 9;
        byte ming_archers_damage = 35;
        byte ming_cavalry_damage = 12;

        int li_warriors = 860;
        int li_archers = (li_archers = li_warriors);
        int li_cavalry = (li_cavalry = li_warriors);
        double ming_warriors = li_warriors * 1.5;
        double ming_archers = (ming_archers = ming_warriors);
        double ming_cavalry = (ming_cavalry = ming_warriors);

        double li_total_damage = (li_warriors_damage + lI_archers_damage + li_cavalry_damage) * (li_warriors);
        double ming_total_damage = (ming_warriors_damage + ming_archers_damage + ming_cavalry_damage) * (ming_warriors);

        System.out.println("Li total damage = " + li_total_damage);
        System.out.println("Ming total damage = " + ming_total_damage);


    }
}

