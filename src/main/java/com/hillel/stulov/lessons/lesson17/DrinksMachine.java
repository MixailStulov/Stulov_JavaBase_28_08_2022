package com.hillel.stulov.lessons.lesson17;

public enum DrinksMachine {
    COFFEE(" Coffee"),
    TEA(" Tea"),
    LEMONADE(" Lemonade"),
    MOJITO(" Mojito"),
    WATER(" Water"),
    COLA(" Coca-Cola");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}