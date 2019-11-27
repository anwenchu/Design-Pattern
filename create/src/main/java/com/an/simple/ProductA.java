package com.an.simple;

public class ProductA implements Product {
    @Override
    public String create() {
        System.out.println("I am ProductA");
        return "I am ProductA";
    }
}
