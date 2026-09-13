package com.singleton.design.exp2;

class Singleton {

    // Create one object
    private static Singleton obj = new Singleton();

    // Private constructor
    private Singleton() {
        System.out.println("Object created");
    }

    // Method to return the same object
    public static Singleton getInstance() {
        return obj;
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}