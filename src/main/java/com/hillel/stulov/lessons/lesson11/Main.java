package com.hillel.stulov.lessons.lesson11;

public class Main {
    public static void main(String[] args) {
        System.out.println(personInfo("Homer", "Simpson", "Springfield.", "(800) KL5-3226"));
        System.out.println(personInfo("Ghost", "Busters", "Ney York.", "(800) 555-2368"));
        System.out.println(personInfo("Fox", "Mulder", " Martha's Vineyard, Massachusetts.", "(800) 555-0199"));
    }
    static String personInfo(String firstName, String lastName, String city, String number) {
        return "Call to " + firstName + " " + lastName + " from the " + city + " By number:" + number + ".";
    }
}
