package com.an.method;

public class ProductA implements Product {

    @Override
    public String getName() {
        System.out.println("I am product A");
        return "I am product A";
    }
}
