package com.kw.pattern.template;

public abstract class FryTemplate {

    public void cook(){
        pourOil();

        hotOil();

        pourVegetable();

        pourSauce();

        fry();
    }

    void pourOil(){
        System.out.println("倒入油");
    };

    void hotOil(){
        System.out.println("把油烧热");
    };

    void pourVegetable(){};

    void pourSauce(){};

    void fry(){
        System.out.println("翻炒");
    };
}
