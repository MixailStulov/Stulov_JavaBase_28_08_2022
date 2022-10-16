//package com.hillel.stulov.lessons.lesson12;
//
//public class Burger {
//
//    String bBun;
//    String bMeat;
//    String bDoubleMeat;
//    String bCheese;
//    String bGreens;
//    String bSauce;
//    String bOnion;
//    String bTomato;
//    String bPickles;
//
//
//    public Burger(String Bun, String Meat, String Cheese, String Greens, String Sauce, String Onion, String Tomato, String Pickles) {
//        this.bBun = Bun;
//        this.bMeat = Meat;
//        this.bCheese = Cheese;
//        this.bGreens = Greens;
//        this.bSauce = Sauce;
//        this.bTomato = Tomato;
//        this.bPickles = Pickles;
//        this.bOnion = Onion;
//        System.out.println("Standard burger " + Bun + ", " + Meat + ", " + Cheese + ", " + Greens + ", " + Onion + ", " + Tomato + ", " + Sauce + ", " + Pickles + ".");
//    }
//
//
//    public Burger(String Bun, String Meat, String Cheese, String Greens, String Onion, String Tomato, String Pickles) {
//        this.bBun = Bun;
//        this.bMeat = Meat;
//        this.bCheese = Cheese;
//        this.bGreens = Greens;
//        this.bOnion = Onion;
//        this.bTomato = Tomato;
//        this.bPickles = Pickles;
//        System.out.println("Diet burger " + Bun + ", " + Meat + ", " + Cheese + ", " + Greens + ", " + Onion + ", " + Tomato + ", " + Pickles + ".");
//    }
//
//    public Burger(String Bun, String Cheese, String Greens, String Sauce, String Onion, String Tomato, String Pickles, String DoubleMeat) {
//        this.bBun = Bun;
//        this.bCheese = Cheese;
//        this.bGreens = Greens;
//        this.bSauce = Sauce;
//        this.bOnion = Onion;
//        this.bTomato = Tomato;
//        this.bPickles = Pickles;
//        this.bDoubleMeat = DoubleMeat;
//        System.out.println("DoubleMeat burger " + Bun + ", " + DoubleMeat + ", " + Cheese + ", " + Greens + ", " + Onion + ", " + Tomato + ", " + Sauce + ", " + Pickles + ".");
//    }
//
//    @Override
//    public String toString() {
//        return "Burger{" +
//                "bBun='" + bBun + '\'' +
//                ", bMeat='" + bMeat + '\'' +
//                ", bDoubleMeat='" + bDoubleMeat + '\'' +
//                ", bCheese='" + bCheese + '\'' +
//                ", bGreens='" + bGreens + '\'' +
//                ", bSauce='" + bSauce + '\'' +
//                ", bOnion='" + bOnion + '\'' +
//                ", bTomato='" + bTomato + '\'' +
//                ", bPickles='" + bPickles + '\'' +
//                '}';
//    }
//}