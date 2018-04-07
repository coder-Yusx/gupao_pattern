package com.kw.pattern.factory.abstrac.test;

import com.kw.pattern.factory.Milk;
import com.kw.pattern.factory.abstrac.factory.AbstractMilkFactory;
import com.kw.pattern.factory.abstrac.factory.AbstractMilkFactoryImpl;

public class AbstractMilkFactoryTest {
    public static void main(String[] args) {
        AbstractMilkFactory milkFactory = new AbstractMilkFactoryImpl();
        Milk mengNiu = milkFactory.getMengNiu();
        Milk yiLi = milkFactory.getYiLi();
        System.out.println(mengNiu.getname());
        System.out.println(yiLi.getname());
    }
}
