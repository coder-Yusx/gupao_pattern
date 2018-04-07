package com.kw.pattern.strategy.complex.visit;

import com.kw.pattern.strategy.complex.choice.TheDay;
/*模拟选择某一天探望
* */
public class ComplexStrategyTest {
    public static void main(String[] args) {

        Visit visit = new Visit();
        visit.chooseDay(TheDay.TUESDAY);
    }
}
