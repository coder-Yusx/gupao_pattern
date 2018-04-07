package com.kw.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HouseProxy implements MethodInterceptor {

    public Object getProxy(Class<?> clazz){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("找房源");
        System.out.println("约看房");
        methodProxy.invokeSuper(o, objects);
        System.out.println("收提成");
        return null;
    }
}
