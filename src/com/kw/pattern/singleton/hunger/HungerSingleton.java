package com.kw.pattern.singleton.hunger;

//饿汉式单例
//instant是在类创建时就加载，不是动态加载，有可能会存在自愿浪费，但是线程安全
public class HungerSingleton {

    private static  HungerSingleton instants = new HungerSingleton();

    private HungerSingleton(){};

    public static HungerSingleton getInstance(){
        return instants;
    }
}
