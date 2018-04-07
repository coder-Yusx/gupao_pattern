package com.kw.pattern.factory.abstrac.factory;


import com.kw.pattern.factory.MengNiu;
import com.kw.pattern.factory.Milk;
import com.kw.pattern.factory.YiLi;

public class AbstractMilkFactoryImpl extends AbstractMilkFactory {
    @Override
    //抽象工厂加工厂方法
    /*public Milk getYiLi() {
        return new YiLiFactory().getMilk();
    }*/

    //抽象工厂
    public Milk getYiLi() {
        return new YiLi("伊利");
    }

    @Override
    /*public Milk getMengNiu() {
        return new MengNiuFactory().getMilk();
    }*/
    public Milk getMengNiu() {
        return new MengNiu("蒙牛");
    }
}
