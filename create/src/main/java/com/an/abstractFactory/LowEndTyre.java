package com.an.abstractFactory;

/**
 * 具体产品：低端轮胎
 */
public class LowEndTyre implements Tyre {
    @Override
    public String use() {
        System.out.println("低端轮胎，贼难用");
        return "低端轮胎，贼难用";
    }
}
