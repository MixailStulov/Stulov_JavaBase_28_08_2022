package com.hillel.stulov.lessons.lesson12;

public class BurgerMain {
    public static void main(String[] args) {

        Burger dietBurger = new Burger("bun", "meat", "cheese", "greens", "onion", "tomato", "pickles");
        Burger standardBurger = new Burger("bun", "meat", "cheese", "greens", "sauce", "onion", "tomato", "pickles");
        Burger doubleMeatBurger = new Burger("bun", "cheese", "greens", "sauce", "onion", "tomato", "pickles", "double meat");
    }
}
