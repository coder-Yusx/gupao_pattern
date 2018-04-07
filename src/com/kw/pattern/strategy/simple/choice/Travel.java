package com.kw.pattern.strategy.simple.choice;


public class Travel {

    private Transport transport;

    public Travel() {
    }

    public Travel(Transport transport) {
        this.transport = transport;
    }

    public void byWhat(){
        transport.theWay();
    }
}
