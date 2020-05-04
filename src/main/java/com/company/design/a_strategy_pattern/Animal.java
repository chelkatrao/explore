package com.company.design.a_strategy_pattern;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flys flyingType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            System.out.println("Height must be bigger than 0");
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
        else
            System.out.println("Weight must be bigger than 0");
    }

    public int getWeight() {
        return this.weight;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavFood() {
        return this.favFood;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public String tryToFly() {
        return this.flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyingType) {
        this.flyingType = newFlyingType;
    }
}
