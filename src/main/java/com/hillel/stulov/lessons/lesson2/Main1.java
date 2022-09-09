package com.hillel.stulov.lessons.lesson2;

public class Main1 {
    public static void main(String[] args) {

        byte wgs84_1 = 46;
        byte wgs84_2 = 29;
        byte wgs84_3 = 17;
        byte wgs84_4 = 30;
        byte wgs84_5 = 44;
        byte wgs84_6 = 28;
        char wgs84_01 = '\u00B0';
        char wgs84_02 = '\u005c\u0027';
        char wgs84_03 = '\"';
        char wgs84_04 = 'N';
        char wgs84_05 = 'E';
        double wgs84_7 = 46.488056;
        double wgs84_8 = 30.741111;
        int utm2 = 326636;
        int utm3 = 5150755;
        String utm1 = "36T";

        System.out.println("Coordinates of the monument to Armand Emmanuel du Plessis, Duke de Richelieu.");
        System.out.println("World Geodetic System 1984(wgs84) " + wgs84_1 + wgs84_01 + " " + wgs84_2 + wgs84_02 +" " + wgs84_3 + wgs84_03 +"" + wgs84_04 + ", " + wgs84_4 + wgs84_01 + " " + wgs84_5 + wgs84_02 + " " + wgs84_6 + wgs84_03 + "" + wgs84_05 +" or " + wgs84_7 + wgs84_01 + ", " + wgs84_8 + wgs84_01 + "");
        System.out.println("Universal Transverse Mercator(utm) " + utm1 + " " + utm2 + " " + utm3 + "");
    }
}