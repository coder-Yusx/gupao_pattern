package com.kw.pattern.factory.simple.test;

import com.kw.pattern.factory.Milk;
import com.kw.pattern.factory.simple.factory.MilkFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        MilkFactory mk = new MilkFactory();
        Milk yili = mk.getMilk("伊利");
        System.out.println(yili.getname());

        Milk mengniu = mk.getMilk("蒙牛");
        System.out.println(mengniu.getname());
    }
}
