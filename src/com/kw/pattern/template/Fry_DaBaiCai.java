package com.kw.pattern.template;

public class Fry_DaBaiCai extends FryTemplate {

    @Override
    void pourVegetable() {
        System.out.println("放入大白菜");
    }

    @Override
    void pourSauce() {
        System.out.println("放入盐，醋，辣椒，十三香");
    }
}
