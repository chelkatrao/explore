package com.chelkatrao.design.b_observer_pattern;

public class Main {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.00);
        stockGrabber.setGoogPrice(676.40);

        new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.00);
        stockGrabber.setGoogPrice(676.40);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.00);

        Thread threadIBM = new Thread(getIBM);
        threadIBM.start();

        Thread threadAAPL = new Thread(getAAPL);
        threadAAPL.start();

        Thread threadGOOG = new Thread(getGOOG);
        threadGOOG.start();

    }
}
