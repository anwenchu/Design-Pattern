package com.an.abstractFactory;

/**
 * 具体产品：低端座椅
 */
public class LowEndSeat implements Seat {
    @Override
    public String feel() {
        return "低端座椅，体验极差";
    }
}
