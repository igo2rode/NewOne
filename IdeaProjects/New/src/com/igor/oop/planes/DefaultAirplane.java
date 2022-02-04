package com.igor.oop.planes;

public class DefaultAirplane {
    private boolean engineStarted;
    private boolean inTheSky;
    private int height;
    private boolean onTheLand;

    void engineStart() {
        if (!engineStarted) {
            engineStarted = true;
            System.out.println("The engine started");
        } else
            System.out.println("Error! The engine have been already started");
    }

    void takeOff() {
        if (engineStarted) {
            height += 500;
            System.out.println("Airplane took off. The height is 500");
            inTheSky = true;
        } else {
            System.out.println("Your engine is off. Please, start the engine");
        }
    }

    void hightIncrease() {
        if (height >= 500 && height < 2500) {
            height += 100;
            System.out.println("Your height is " + height);
        } else if (height < 100) {
            System.out.println("Airplane didn't take off");
        } else {
            System.out.println("You rich maximum height");
        }
    }

    void hightDecrease() {
        if (height > 500 && height <= 2500) {
            height -= 100;
            System.out.println("Your height is " + height);
        } else if (height == 500) {
            System.out.println("The lowest height before landing");
        }
    }

    void landing() {
        if (height == 500) {
            height -= 500;
            System.out.println("Congratulations. You are on the land");
        } else {
            System.out.println("Your height is not suitable");
        }
    }

    void switchEngineOff() {
        if (height == 0 && engineStarted) {
            engineStarted = false;
            System.out.println("The engine have been stopped");
        } else {
            System.out.println("You can't stop engine in the sky or the engine have not been started");
        }
    }
}
