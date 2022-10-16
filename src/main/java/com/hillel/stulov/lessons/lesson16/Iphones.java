package com.hillel.stulov.lessons.lesson16;

public class Iphones extends IOS implements Smartphones {

    @Override
    public void call() {
        System.out.println("Call from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Write sms from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Use internet from iPhone");
    }

    @Override
    void ios() {
        System.out.println("Hello from Iphone");
    }
}