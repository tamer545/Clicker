package clicker;

import javax.swing.*;

public class ClickerPresenter {
    private ClickerView view;
    private Formatter formatter;
    private double apples = 0;
    private double applesPerSecond = 0;
    private Timer timer;

    private int kidPrice = 10;
    private int farmerPrice = 50;
    private int grandmaPrice = 200;
    private int grandpaPrice = 500;
    private int tractorPrice = 2000;
    private int factoryPrice = 5000;
    private int lohnPrice = 20000;
    private int herblingenPrice = 100000;


    public ClickerPresenter(ClickerView view) {
        this.view = view;
        this.view.setPresenter(this);

        formatter = new Formatter();
        timer = new Timer(1000, e -> {


            apples += applesPerSecond;

            setAppleFormat();
        });
        view.setKidPriceLabel(formatter.format(kidPrice));
        view.setFarmerPriceLabel(formatter.format(farmerPrice));
        view.setGrandmaPriceLabel(formatter.format(grandmaPrice));
        view.setGrandpaPriceLabel(formatter.format(grandpaPrice));
        view.setTractorPriceLabel(formatter.format(tractorPrice));
        view.setFactoryPriceLabel(formatter.format(factoryPrice));
        view.setLohnPriceLabel(formatter.format(lohnPrice));
        view.setHerblingenPriceLabel(formatter.format(herblingenPrice));
    }

    public void kidBought() {
        if (apples >= kidPrice) {
            applesPerSecond += 1;
            apples -= kidPrice;
            kidPrice += kidPrice;
            view.setKidPriceLabel(formatter.format(kidPrice));
            updateTimer();
        }
    }

    public void farmerBought() {
        if (apples >= farmerPrice) {
            applesPerSecond += 2;
            apples -= farmerPrice;
            farmerPrice += farmerPrice;
            view.setFarmerPriceLabel(formatter.format(farmerPrice));
            updateTimer();
        }
    }

    public void grandmaBought() {
        if (apples >= grandmaPrice) {
            applesPerSecond += 5;
            apples -= grandmaPrice;
            grandmaPrice += grandmaPrice;
            view.setGrandmaPriceLabel(formatter.format(grandmaPrice));
            updateTimer();
        }
    }

    public void grandpaBought() {
        if (apples >= grandpaPrice) {
            applesPerSecond += 10;
            apples -= grandpaPrice;
            grandpaPrice += grandpaPrice;
            view.setGrandpaPriceLabel(formatter.format(grandpaPrice));
            updateTimer();
        }
    }

    public void tractorBought() {
        if (apples >= tractorPrice) {
            applesPerSecond += 50;
            apples -= tractorPrice;
            tractorPrice += tractorPrice;
            view.setTractorPriceLabel(formatter.format(tractorPrice));
            updateTimer();
        }
    }

    public void factoryBought() {
        if (apples >= factoryPrice) {
            applesPerSecond += 200;
            apples -= factoryPrice;
            factoryPrice += factoryPrice;
            view.setFactoryPriceLabel(formatter.format(factoryPrice));
            updateTimer();
        }
    }

    public void lohnBought() {
        if (apples >= lohnPrice) {
            applesPerSecond += 1000;
            apples -= lohnPrice;
            lohnPrice += lohnPrice;
            view.setLohnPriceLabel(formatter.format(lohnPrice));
            updateTimer();
        }
    }

    public void herblingenBought() {
        if (apples >= herblingenPrice) {
            applesPerSecond += 10000;
            apples -= herblingenPrice;
            herblingenPrice += herblingenPrice;
            view.setLohnPriceLabel(formatter.format(herblingenPrice));
            updateTimer();
        }
    }

    public void addApple() {
        apples++;
        setAppleFormat();
    }

    public void setAppleFormat() {
        view.setAppleLabel(formatter.format(Math.floor(apples)));
    }

    public void updateTimer() {
        timer.start();
        view.setPerSecLabel(formatter.format(applesPerSecond));
        setAppleFormat();
    }
}

