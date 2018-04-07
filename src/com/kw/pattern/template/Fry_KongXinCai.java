package com.kw.pattern.template;

public class Fry_KongXinCai extends FryTemplate {

    @Override
    void pourVegetable() {
        System.out.println("放入空心菜");
    }

    @Override
    void pourSauce() {
        System.out.println("放入盐，蒜蓉，十三香");
    }
}
