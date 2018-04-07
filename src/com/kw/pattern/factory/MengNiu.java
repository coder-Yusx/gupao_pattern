package com.kw.pattern.factory;

public class MengNiu implements Milk {

    private String name;

    public MengNiu() {
    }
    public MengNiu(String name) {
        this.name = name;
    }
    public String getname(){
        return name;
    }
}
