package com.kw.pattern.strategy.complex.choice;

public class Wednesday implements WeekDay {
    @Override
    public void theDay() {
        System.out.println("You choose the Wednesday");
    }
}
