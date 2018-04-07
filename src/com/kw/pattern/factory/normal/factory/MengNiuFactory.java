package com.kw.pattern.factory.normal.factory;

import com.kw.pattern.factory.MengNiu;
import com.kw.pattern.factory.Milk;

public class MengNiuFactory implements MilkFactory{
    @Override
    public Milk getMilk() {
        return new MengNiu("蒙牛");
    }
}
