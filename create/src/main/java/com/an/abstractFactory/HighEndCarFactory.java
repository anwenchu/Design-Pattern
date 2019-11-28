package com.an.abstractFactory;

/**
 * 具体产品：高端汽车
 */
public class HighEndCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HighEndEngine();
    }

    @Override
    public Tyre createTyre() {
        return new HighEndTyre();
    }

    @Override
    public Seat createSeat() {
        return new HighEndSeat();
    }
}
