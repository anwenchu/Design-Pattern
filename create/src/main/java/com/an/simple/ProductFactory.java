package com.an.simple;

public class ProductFactory {

    public static Product getProduct(String name) {
        if ("A".equals(name)) {
            return new ProductA();
        }
        if ("B".equals(name)) {
            return new ProductB();
        }
        return null;
    }
}
