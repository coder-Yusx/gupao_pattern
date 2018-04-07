package com.kw.pattern.factory;

public class YiLi implements Milk {

    private String name;

    public YiLi() {
    }
    public YiLi(String name) {
        this.name = name;
    }
    public String getname(){
        return name;
    }
}
