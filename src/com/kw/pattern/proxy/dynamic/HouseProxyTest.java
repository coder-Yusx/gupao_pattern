package com.kw.pattern.proxy.dynamic;

public class HouseProxyTest {
    public static void main(String[] args) {

        Person person = new Yusx();
        HouseProxy houseProxy = new HouseProxy();

        Person p2 = (Person)houseProxy.bind(person);
        p2.findHouse();
    }
}
