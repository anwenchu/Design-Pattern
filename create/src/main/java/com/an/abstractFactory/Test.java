package com.an.abstractFactory;

/**
 * @author an_wch
 * @date 2019-11-28 下午5:24
 */
public class Test {
    
    /**
    * @Description:
    * @Param: 
    * @return: 
    * @Author: an_wch
    * @Date: 2019/11/28
    */
    public static void main(String[] args) {
        CarFactory cf = new HighEndCarFactory();

        Engine engine = cf.createEngine();
        engine.run();

        Tyre tyre = cf.createTyre();
        tyre.use();

        Seat seat = cf.createSeat();
        seat.feel();
    }
}
