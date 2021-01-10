package clicker;

import javax.swing.*;

public class ClickerPresenter {
    private ClickerView view;
    private int apples = 0;
    private double applesPerSecond = 0;
    private Timer timer;

    private int kidPrice = 0;
    private int farmerPrice = 50;
    private int grandmaPrice = 200;
    private int grandpaPrice = 500;
    private int tractorPrice = 2000;
    private int factoryPrice = 5000;


    public ClickerPresenter(ClickerView view) {
        this.view = view;
        this.view.setPresenter(this);

        timer = new Timer(1000, e -> {
            apples += applesPerSecond;

            if (apples < 10000) {
                view.setAppleLabel(String.valueOf(apples));
            } else {
                view.setAppleLabel(apples / 1000 + "k");
            }
        });

        view.setKidPriceLabel(String.valueOf(kidPrice));
        view.setFarmerPriceLabel(String.valueOf(farmerPrice));
        view.setGrandmaPriceLabel(String.valueOf(grandmaPrice));
        view.setGrandpaPriceLabel(String.valueOf(grandpaPrice));
        view.setTractorPriceLabel(tractorPrice / 1000 + "k");
        view.setFactoryPriceLabel(factoryPrice / 1000 + "k");

    }

    public void kidBought() {
        if (apples >= kidPrice) {
            applesPerSecond += 1;
            apples -= kidPrice;
            kidPrice += 10;
            view.setKidPriceLabel(String.valueOf(kidPrice));
            updateTimer();
        }
    }

    public void farmerBought() {
        if (apples >= farmerPrice) {
            applesPerSecond += 2;
            apples -= farmerPrice;
            farmerPrice += 50;
            view.setFarmerPriceLabel(String.valueOf(farmerPrice));
            updateTimer();
        }
    }

    public void grandmaBought() {
        if (apples >= grandmaPrice) {
            applesPerSecond += 5;
            apples -= grandmaPrice;
            grandmaPrice += 200;
            view.setGrandmaPriceLabel(String.valueOf(grandmaPrice));
            updateTimer();
        }
    }

    public void grandpaBought() {
        if (apples >= grandpaPrice) {
            applesPerSecond += 10;
            apples -= grandpaPrice;
            grandpaPrice += 500;
            view.setGrandpaPriceLabel(String.valueOf(grandpaPrice));
            updateTimer();
        }
    }

    public void tractorBought() {
        if (apples >= tractorPrice) {
            applesPerSecond += 50;
            apples -= tractorPrice;
            tractorPrice += 2000;
            view.setTractorPriceLabel(tractorPrice / 1000 + "k");
            updateTimer();
        }
    }

    public void factoryBought() {
        if (apples >= factoryPrice) {
            applesPerSecond += 200;
            apples -= factoryPrice;
            factoryPrice += 5000;
            view.setFactoryPriceLabel(factoryPrice / 1000 + "k");
            updateTimer();
        }
    }

    public void updateTimer() {
        timer.start();

        view.setPerSecLabel(String.format("%1.0f", (applesPerSecond)));
    }
}

