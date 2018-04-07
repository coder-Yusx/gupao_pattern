package com.kw.pattern.template;

public class TemplateTest {
    public static void main(String[] args) {

        FryTemplate fryTemplate = new Fry_DaBaiCai();
        fryTemplate.cook();

        System.out.println("------------------------------");
        FryTemplate fryTemplate1 = new Fry_KongXinCai();
        fryTemplate1.cook();
    }
}
