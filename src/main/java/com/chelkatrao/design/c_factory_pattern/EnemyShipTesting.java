package com.chelkatrao.design.c_factory_pattern;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String args[]) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type ship? (U/R/B)");

        if (scanner.hasNextLine()) {
            String typeOfShip = scanner.nextLine();
            theEnemy = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy!= null)
        doStuffEnemy(theEnemy);
        else System.out.println("Enter a U,R,B next time");
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
