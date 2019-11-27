package com.an.method;

public class ProductBFactory implements ProductFactory {

    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
