package com.hillel.stulov.lessons.lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0;
        int n = 0;
        System.out.println("Enter two integers from 1 to 10: ");
        for (int i = 0; i < 1; i++) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
            } else {
                System.out.println("Wrong data, enter from 1 to 10");
                scanner.nextLine();
                i--;
                continue;
            }
            scanner.nextLine();
            if (m < 1 || m > 10) {
                System.out.println("Wrong data, enter from 1 to 10");
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                System.out.println("Wrong data, enter from 1 to 10");
                scanner.nextLine();
                i--;
                continue;
            }
            scanner.nextLine();
            if (n < 1 || n > 10) {
                System.out.println("Wrong data, enter from 1 to 10");
                i--;
            }
        }
        int[][] array = new int[n][m];

        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (int)(Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
