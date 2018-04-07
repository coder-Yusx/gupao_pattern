package com.kw.pattern.strategy.complex.choice;

public enum TheDay {

    MONDAY(new Monday()),
    TUESDAY(new Tuesday()),
    WENDESDAY(new Wednesday());

    private WeekDay weekDay;

    TheDay() {
    }

    TheDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }
}
