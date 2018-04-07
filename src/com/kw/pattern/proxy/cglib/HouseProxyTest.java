package com.kw.pattern.proxy.cglib;

public class HouseProxyTest {
    public static void main(String[] args) {

        Yusx yusx = (Yusx)new HouseProxy().getProxy(Yusx.class);
        yusx.findHouse();

        //System.out.println(yusx);
    }
}
