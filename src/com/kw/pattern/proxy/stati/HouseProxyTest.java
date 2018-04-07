package com.kw.pattern.proxy.stati;

public class HouseProxyTest {
    public static void main(String[] args) {

        Person person = new Yusx();

        HouseProxy houseProxy = new HouseProxy(person);

        houseProxy.findHouse();
    }
}
