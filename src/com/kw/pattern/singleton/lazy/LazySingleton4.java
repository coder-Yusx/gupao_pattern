package com.kw.pattern.singleton.lazy;

//懒汉式单例4（防反射）
//实现动态加载，按需加载，不会存在资源浪费，利用内部类加载机制保证线程安全（只有在外部类方法被调用时，内部类才能加载）
public class LazySingleton4 {

    private boolean initialized = false;

    //防止反射强制调用构造方法。
    private LazySingleton4(){
        synchronized (LazySingleton4.class){
            if(initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已经被侵犯");
            }
        }
    };

    public static class SingletonHolder{
        private static final LazySingleton4 instants = new LazySingleton4();
    }

    public static LazySingleton4 getInstants(){
        return SingletonHolder.instants;
    }

}
