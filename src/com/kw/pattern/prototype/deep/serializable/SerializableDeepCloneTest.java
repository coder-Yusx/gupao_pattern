package com.kw.pattern.prototype.deep.serializable;

import java.util.Date;

public class SerializableDeepCloneTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("李文");
        p.setSex("woman");
        p.setBirthday(new Date());

        Person clone = DeepCloneUtils.clone(p);

        System.out.println(p == clone);
        System.out.println(p.getName() == clone.getName());
        System.out.println(p.getBirthday() == clone.getBirthday());
    }
}
