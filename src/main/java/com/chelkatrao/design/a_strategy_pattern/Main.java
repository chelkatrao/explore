package com.chelkatrao.design.a_strategy_pattern;

public class Main {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweet = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweet.tryToFly());

        sparky.setFlyingAbility(new ItFly());
        System.out.println("Dog: " + sparky.tryToFly());
    }
}
