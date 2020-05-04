package com.company.design.a_strategy_pattern;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFly();
    }
}
