package com.hillel.stulov.lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        Trekker  shaquille = new Trekker(" Shaquille", "O'Neal", "shaq@mail.com",
                "555-0001", 6, "may", 1972, 140,
                140, 29000);

        Trekker jordan = new Trekker("Michael", "Jordan", "jordan@mail.com",
                "555-0002", 17, "february", 1963, 95,
                145, 31000);

        Trekker rodman = new Trekker(" Dennis", "Rodman", "holden@mail.com",
                "555-0003", 13, "may", 1961, 101,
                150, 35000);

        Trekker leBron = new Trekker("LeBron", "James", "le_bron@mail.com",
                "555-0004", 30, "december", 1984, 109,
                140, 33000);

        Trekker pippen = new Trekker("Scottie", "Pippen", "pippen@mail.com",
                "555-0005", 25, "september", 1965, 100,
                130, 30500);

        System.out.println(shaquille.printAccount());
        System.out.println("");
        System.out.println(jordan.printAccount());
        System.out.println("");
        System.out.println(rodman.printAccount());
        System.out.println("");
        System.out.println(leBron.printAccount());
        System.out.println("");
        System.out.println(pippen.printAccount());

        leBron.setSurname("Rodman");
        leBron.setSteps(29500);

        pippen.setSurname("O'Neal");
        pippen.setSteps(31200);

        System.out.println("");
        System.out.println(" updated data ");
        System.out.println(leBron.printAccount());
        System.out.println("");
        System.out.println(pippen.printAccount());


    }
}