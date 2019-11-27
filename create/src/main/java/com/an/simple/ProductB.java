package com.an.simple;

public class ProductB implements Product {
    @Override
    public String create() {
        System.out.println("I am ProductB");
        return "I am ProductB";
    }
}
