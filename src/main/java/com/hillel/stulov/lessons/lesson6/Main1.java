package com.hillel.stulov.lessons.lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
                continue;
            } else {
                System.out.println("shuttle number:" + i);
                counter++;
            }
            System.out.print("count = " + counter);


        }
    }
}
//    int counter = 0;
//        for (int i = 1; counter < 100; i++) {
//            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
//                continue;
//            } else {
//                System.out.println("number: " + i);
//                counter++;
//            }
//        }
//        System.out.println("counter = " + counter);

    /*int n = 0, i = 0;
        while (n < 100) {
        if (!String.valueOf( i ).contains( "4" ) || !String.valueOf( i ).contains( "9" )) {
        System.out.println(i);
        n++;
        }
        i++;
        } */
