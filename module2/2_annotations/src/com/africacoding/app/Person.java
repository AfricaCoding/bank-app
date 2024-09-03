package com.africacoding.app;

public class Person {


    public String name;

    private int age;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public void afficherMessage() {
        System.out.println("Ceci est un message.");
    }
}
