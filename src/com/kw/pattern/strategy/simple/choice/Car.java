package com.kw.pattern.strategy.simple.choice;

public class Car implements Transport {
    @Override
    public void theWay() {
        System.out.println("Hi , You choose the car");
    }
}
