package com.company.design.d_singleton_pattern;

public class ScrabbleTestThread {
    public static void main(String[] args) {
        Runnable getTitles = new GetTheTitle();

        Runnable getTitlesAgain = new GetTheTitle();
        Runnable getTitlesAgain2 = new GetTheTitle();

        new Thread(getTitles).start();
        new Thread(getTitlesAgain).start();
        new Thread(getTitlesAgain2).start();
    }
}
