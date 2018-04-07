package com.kw.pattern.singleton.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/*
* 注册式单例模式
* spring中单例模式的用法
* */
public class SpringSingleton {

    private static Map<String , Object> instance = new ConcurrentHashMap<String , Object>();

    private SpringSingleton(){}

    public static Object getInstance(String className) {
        if(instance.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className);
                instance.put(className , obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return obj;
        }else {
            return instance.get(className);
        }
    }
}
