package com.kw.pattern.singleton.lazy;

//懒汉式单例3
//实现动态加载，按需加载，不会存在资源浪费，利用内部类加载机制保证线程安全（只有在外部类方法被调用时，内部类才能加载）
public class LazySingleton3 {

    public static class SingletonHolder{
        private static final LazySingleton3 instants = new LazySingleton3();
    }

    private LazySingleton3(){};

    public static LazySingleton3 getInstants(){
        return SingletonHolder.instants;
    }

}
