package com.kw.pattern.singleton.lazy;

//懒汉式单例
//实现动态加载，按需加载，不会存在资源浪费，但是线程不安全，实际生产中绝对不会被用到。
public class LazySingleton {

    private static  LazySingleton instants = null;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if(instants == null){
            instants = new LazySingleton();
        }
        return instants;
    }
}
