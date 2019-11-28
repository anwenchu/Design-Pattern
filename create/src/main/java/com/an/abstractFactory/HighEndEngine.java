package com.an.abstractFactory;

/**
 * 具体产品：高端发动机
 */
public class HighEndEngine implements Engine {

    @Override
    public String run() {
        System.out.println("高端发动机，启动贼快");
        return "高端发动机，启动贼快";
    }
}
