package com.kw.pattern.factory.normal.test;

import com.kw.pattern.factory.Milk;
import com.kw.pattern.factory.normal.factory.MengNiuFactory;
import com.kw.pattern.factory.normal.factory.MilkFactory;
import com.kw.pattern.factory.normal.factory.YiLiFactory;

public class NormalFactoryTest {
    public static void main(String[] args) {
        MilkFactory yili = new YiLiFactory();
        Milk milk = yili.getMilk();
        System.out.println(milk.getname());

        MilkFactory mengniu = new MengNiuFactory();
        Milk milk1 = mengniu.getMilk();
        System.out.println(milk1.getname());
    }
}
