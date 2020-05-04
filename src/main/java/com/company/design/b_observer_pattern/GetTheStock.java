package com.company.design.b_observer_pattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock,
                       double newPrice) {
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        price = newPrice;
        stock = newStock;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            }

            double randNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.parseDouble(df.format(price + randNum));

            if (stock.equals("IBM")) ((StockGrabber) stockGrabber).setIbmPrice(price);
            if (stock.equals("AAPL")) ((StockGrabber) stockGrabber).setIbmPrice(price);
            if (stock.equals("IBM")) ((StockGrabber) stockGrabber).setIbmPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();

        }
    }
}
