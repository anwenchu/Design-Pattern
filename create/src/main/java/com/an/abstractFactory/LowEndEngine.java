package com.an.abstractFactory;

/**
 * 具体产品：低端发动机
 */
public class LowEndEngine implements Engine {
    @Override
    public String run() {
        System.out.println("低端发动机，启动贼慢");
        return "低端发动机，启动贼慢";
    }
}
