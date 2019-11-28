package com.an.abstractFactory;

/**
 * 抽象产品：汽车工厂
 */
public interface CarFactory {

    Engine createEngine();

    Tyre createTyre();

    Seat createSeat();
}
