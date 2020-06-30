package com.chelkatrao.design.a_strategy_pattern;

public interface Flys {
    String fly();
}

class CantFly implements Flys {
    @Override
    public String fly() {
        return "I can't fly";
    }
}

class ItFly implements Flys {
    @Override
    public String fly() {
        return "Flying high!";
    }
}