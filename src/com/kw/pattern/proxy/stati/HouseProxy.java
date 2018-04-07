package com.kw.pattern.proxy.stati;

public class HouseProxy implements Person {

    private Person person;

    public HouseProxy() {
    }

    public HouseProxy(Person person) {
        this.person = person;
    }

    @Override
    public void findHouse() {
        System.out.println("找房源");
        System.out.println("约看房");
        person.findHouse();
        System.out.println("收提成");
    }
}
