package com.company.design.c_factory_pattern;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newEnemyShip) {

        EnemyShip enemyShip = null;

        switch (newEnemyShip) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }
    }
}
