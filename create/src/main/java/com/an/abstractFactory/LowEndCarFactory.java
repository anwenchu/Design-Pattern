package com.an.abstractFactory;

/**
 * 具体产品： 低端汽车
 */
public class LowEndCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LowEndEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LowEndTyre();
    }

    @Override
    public Seat createSeat() {
        return new LowEndSeat();
    }
}
