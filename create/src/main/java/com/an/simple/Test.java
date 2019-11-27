package com.an.simple;

public class Test {

    public static void main(String[] args) {

        Product productA = ProductFactory.getProduct("A");
        Product productB = ProductFactory.getProduct("B");
        productA.create();
        productB.create();
    }
}
