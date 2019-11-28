package com.an.abstractFactory;

/**
 * 具体产品：高端轮胎
 */
public class HighEndTyre implements Tyre{


    @Override
    public String use() {
        System.out.println("高端轮胎，防滑耐磨");
        return "高端轮胎，防滑耐磨";
    }
}
