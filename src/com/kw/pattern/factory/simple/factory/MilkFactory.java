package com.kw.pattern.factory.simple.factory;

import com.kw.pattern.factory.MengNiu;
import com.kw.pattern.factory.Milk;
import com.kw.pattern.factory.YiLi;

public class MilkFactory {
    public Milk getMilk(String name){
        if("蒙牛".equals(name)){
            return new MengNiu(name);
        }else if("伊利".equals(name)){
            return new YiLi(name);
        }
        return null;
    }
}
