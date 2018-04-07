package com.kw.pattern.strategy.simple.choice;

public class Plane implements Transport {
    @Override
    public void theWay() {
        System.out.println("Hi , You choose the plane");
    }
}
