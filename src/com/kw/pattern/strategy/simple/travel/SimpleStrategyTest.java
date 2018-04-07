package com.kw.pattern.strategy.simple.travel;

import com.kw.pattern.strategy.simple.choice.Car;
import com.kw.pattern.strategy.simple.choice.Travel;

/*模拟出游交通工具选择
* */
public class SimpleStrategyTest {
    public static void main(String[] args) {
        Travel travel = new Travel(new Car());
        travel.byWhat();

        Travel travel2 = new Travel(new Train());
        travel2.byWhat();
    }
}
