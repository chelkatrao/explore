package com.chelkatrao.design.d_singleton_pattern;

import java.util.LinkedList;

public class GetTheTitle implements Runnable {
    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTitle = newInstance.getTitle(7);

        System.out.println("Player : " + playerOneTitle);

        System.out.println(newInstance.getLetterList());

        System.out.println("Got Titles");

    }
}
