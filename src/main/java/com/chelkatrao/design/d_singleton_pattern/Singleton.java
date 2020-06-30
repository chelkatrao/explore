package com.chelkatrao.design.d_singleton_pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;
    String[] alphabet = {
            "a", "b", "c", "d", "a", "b", "c", "d",
            "a", "b", "c", "d", "a", "b", "c", "d",
            "a", "b", "c", "d", "a", "b", "c", "d",
            "a", "b", "c", "d", "a", "b", "c", "d",
            "i", "j", "k", "l", "i", "j", "k", "l",
            "i", "j", "k", "l", "i", "j", "k", "l",
            "m", "n", "o", "p", "m", "n", "o", "p",
            "m", "n", "o", "p", "m", "n", "o", "p",
            "q", "r", "s", "t", "q", "r", "s", "t",
            "q", "r", "s", "t", "q", "r", "s", "t",
            "u", "v", "w", "x", "u", "v", "w", "x",
            "u", "v", "w", "x", "u", "v", "w", "x",
            "y", "z"};

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(alphabet));

    static boolean firstThread = true;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new Singleton();
            Collections.shuffle(firstInstance.letterList);
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTitle(int howManyTitles) {
        LinkedList<String> titleToSend = new LinkedList<>();
        for (int i = 0; i < howManyTitles; i++) {
            titleToSend.add(firstInstance.letterList.remove(0));
        }
        return titleToSend;
    }

}
