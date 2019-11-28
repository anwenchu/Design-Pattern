package com.an.abstractFactory;

/**
 * 具体产品：高端座椅
 */
public class HighEndSeat implements Seat {


    @Override
    public String feel() {
        System.out.println("高端座椅，感觉倍棒");
        return "高端座椅，感觉倍棒";
    }
}
