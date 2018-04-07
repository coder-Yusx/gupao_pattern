package com.kw.pattern.factory.normal.factory;

import com.kw.pattern.factory.Milk;
import com.kw.pattern.factory.YiLi;

public class YiLiFactory implements MilkFactory{
    @Override
    public Milk getMilk() {
        return new YiLi("伊利");
    }
}
