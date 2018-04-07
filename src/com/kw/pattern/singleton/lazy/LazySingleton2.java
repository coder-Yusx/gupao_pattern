package com.kw.pattern.singleton.lazy;

import com.kw.pattern.singleton.hunger.HungerSingleton;

//懒汉式单例2
//实现动态加载，按需加载，不会存在资源浪费，同步方法保障线程安全，但是慢的一比，实际生产中没卵用。
public class LazySingleton2 {

    private static LazySingleton2 instants = null;

    private LazySingleton2(){};

    public static LazySingleton2 getInstants(){
        if(instants == null) {
            synchronized (LazySingleton2.class) {
                if (instants == null) {
                    instants = new LazySingleton2();
                }
            }
        }
        return instants;
    }

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        for (int i = 0; i <1000000000 ; i++) {
            LazySingleton.getInstance();
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l);

        long l3 = System.currentTimeMillis();
        for (int i = 0; i <1000000000 ; i++) {
            HungerSingleton.getInstance();
        }
        long l4 = System.currentTimeMillis();
        System.out.println(l4-l3);
    }
}
