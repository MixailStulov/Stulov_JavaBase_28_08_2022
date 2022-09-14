package com.hillel.stulov.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

        char Li_dynasty_warriors_damage = 'a';
        char LI_dynasty_archers_damage = 'b';
        char Li_dynasty_cavalry_damage = 'c';
        char Li_warriors_total = 'k';
        char Li_archers_total = 'l';
        char Li_cavalry_total = 'm';

        char Ming_dynasty_warriors_damage = 'x';
        char Ming_dynasty_archers_damage = 'y';
        char Ming_dynasty_cavalry_damage = 'z';
        char Ming_warriors_total = 'o';
        char Ming_archers_total = 'p';
        char Ming_cavalry_total = 'q';

        byte a = 13;
        byte b = 24;
        byte c = 46;
        byte x = 9;
        byte y = 35;
        byte z = 12;

        int k = 860;
        int l = 860;
        int m = 860;
        double o = k * 1.5;
        double p = l * 1.5;
        double q = m * 1.5;

        int Li_total_damage = (a + b + c) * 860;
        double Ming_total_damage = (x * o) + (y * p) + (z * q);

        System.out.println("Li total damage = " + Li_total_damage);
        System.out.println("Ming total damage = " + Ming_total_damage);
    }
}