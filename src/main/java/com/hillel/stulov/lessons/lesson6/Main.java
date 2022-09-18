package com.hillel.stulov.lessons.lesson6;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

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

            } else if (count == count) {
                System.out.println("Сongratulations you guessed the number!: " + randomNumber);

            } else if (count != randomNumber) {
                System.out.println("Please try againe :)");
                break;

            }
        }
    }
}

/*for (int i = 0; i < 10; i++) { //10 попыток
        int count = gm.nextInt();
        if (count < randomNumber) { //в Java используется CamelCase
        //actions
        } else if (count > randomNumber) {
        //actions
        } else {
        //actions
        break;
  /*Scanner gm = new Scanner(System.in);
        System.out.print("Привет, друг! Я загадал число от 1 до 3, найдется ли силёнок угадать?: ");
                String word = gm.nextLine();
                switch (word) {
                case "Нет":
                System.out.print("Ну, что же, тогда заходи в другой раз!");
                break;

                case "Да":
                System.out.print("Да начнется игра, сынок! Какое число я загадал?: ");
                int count = gm.nextInt();
                int a = 1;
                int b = 2;
                int random_number = a + (int) (Math.random() * b);
                for (int i = 1; i < 10; i++) {
        if (random_number > count) {
        System.out.println("Не верно:)! Мое число больше > твоего ");
        System.out.print("Какое число я загадал?: ");
        int number2 = gm.nextInt();


        } else if (random_number < count) {
        System.out.println("Не верно:)! Мое число меньше < твоего ");
        System.out.print("Какое число я загадал?: ");
        int number3 = gm.nextInt();

        } else {
        System.out.println("Урааа, ты угадал это число!: " + random_number);
        break;*/

