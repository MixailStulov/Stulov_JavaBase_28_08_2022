package com.hillel.stulov.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.print("Guess the number from 1 to 10?:");
        int count;
        int a = 1;
        int b = 10;
        int randomNumber = a + (int) (Math.random() * b);
        System.out.println();
        for (int i = 1; i < 4; i++) {
            count = game.nextInt();
            if (count < randomNumber) {
                System.out.println("Wrong. My number is greater than yours ");

            } else if (count > randomNumber) {
                    System.out.println("Wrong. My number is less than yours ");

            } else {
                System.out.println("Сongratulations you guessed the number!: " + randomNumber);
                System.exit(0);

                }
            }
        }
    }






