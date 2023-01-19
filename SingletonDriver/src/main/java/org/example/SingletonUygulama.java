package org.example;

import static org.example.Singleton.getDriverInstance;

public class SingletonUygulama {
    public static void main(String[] args) {

        getDriverInstance().get("https://www.facebook.com");
        getDriverInstance().get("https://www.google.com");
        getDriverInstance().get("https://www.youtube.com");
    }
}