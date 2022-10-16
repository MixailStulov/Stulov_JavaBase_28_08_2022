package com.hillel.stulov.lessons.lesson14;

public class Main {
    public static void main(String[] args) {


        MusicStyle[] musicStyles = {new RockMusic("System of a Down"),
                new PopMusic("Kaleida"),
                new ClassicMusic("Astor Piazzolla"),
        };
        for (MusicStyle musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
