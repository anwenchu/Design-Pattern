package com.an.method;

public class ProductAFactory implements ProductFactory {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
