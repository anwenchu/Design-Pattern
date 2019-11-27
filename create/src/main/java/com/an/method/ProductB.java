package com.an.method;

public class ProductB implements Product {

    @Override
    public String getName() {
        System.out.println("I am product B");
        return "I am product B";
    }
}
