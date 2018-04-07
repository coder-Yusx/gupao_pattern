package com.kw.pattern.strategy.simple.travel;

import com.kw.pattern.strategy.simple.choice.Transport;

public class Train implements Transport {
    @Override
    public void theWay() {
        System.out.println("Hi , You choose the train");
    }
}
