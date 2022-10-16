package com.hillel.stulov.lessons.lesson14;

public abstract class MusicStyle {

    String name;

    public MusicStyle(String name) {
        this.name = name;
    }

    public abstract void playMusic();
}