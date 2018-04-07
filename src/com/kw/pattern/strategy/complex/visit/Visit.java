package com.kw.pattern.strategy.complex.visit;

import com.kw.pattern.strategy.complex.choice.TheDay;
import com.kw.pattern.strategy.complex.choice.WeekDay;

public class Visit {

    private WeekDay weekday;

    public Visit() {
    }

    public void chooseDay(TheDay theDay){
        theDay.getWeekDay().theDay();
    }
}
