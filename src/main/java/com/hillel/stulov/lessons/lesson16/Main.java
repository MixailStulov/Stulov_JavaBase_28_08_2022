package com.hillel.stulov.lessons.lesson16;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids();
        Iphones iphones = new Iphones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.linuxOs();

        System.out.println("");

        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.ios();
    }
}