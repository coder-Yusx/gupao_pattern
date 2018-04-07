package com.kw.pattern.prototype.superficial;

import java.util.Date;

/*
    浅拷贝
 */
public class SuperficialCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person();
        p.setName("李文");
        p.setSex("woman");
        p.setBirthday(new Date());

        Person clone = (Person) p.clone();

        System.out.println(p == clone);
        System.out.println(p.getName() == clone.getName());
        System.out.println(p.getBirthday() == clone.getBirthday());
    }
}
