package com.kw.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HouseProxy implements InvocationHandler {

    private Person target;

    public Object bind(Person target){

        this.target = target;

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("找房源");
        System.out.println("约看房");
        Object invoke = method.invoke(target, args);
        System.out.println("收提成");
        return invoke;
    }
}
