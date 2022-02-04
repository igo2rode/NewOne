package com.igor.oop.planes;

public abstract class AirplaneImpl implements Airplane {
    protected int speedMax;
    protected int speedMin;
    protected int speedDelta;
    protected int heightMax;
    protected int heightMin;
    protected int heightDelta;
    protected final String name;

    AirplaneImpl(String name) {
        speedMin = 500;
        speedMax = 800;
        speedDelta = 10;
        heightMax = 5000;
        heightMin = 500;
        heightDelta = 10;
        this.name = name;
    }

    protected boolean engineStarted;
    protected boolean inTheSky;
    protected int height = 0;
    protected boolean onTheLand;

    @Override
    public void engineStart() {
        if (!engineStarted) {
            engineStarted = true;
            print("The engine started");
        } else {
            print("Error! The engine have been already started");
        }
    }

    @Override
    public void takeOff() {
        if (engineStarted) {
            height = heightMin;
            print("Airplane took off. The height is 500");
            inTheSky = true;
        } else {
            print("Your engine is off. Please, start the engine");
        }
    }

    @Override
    public void heightIncrease() {
        if (height >= heightMin && height < heightMax) {
            height += heightDelta;
            print("Your height is " + height);
        } else if (height < heightMin) {
            print("Airplane didn't take off");
        } else {
            print("You rich maximum height");
        }
    }

    @Override
    public void heightDecrease() {
        if (height > heightMin && height <= heightMax) {
            height -= heightDelta;
            print("Your height is " + height);
        } else if (height == heightMin) {
            print("The lowest height before landing");
        } else if (height == 0 ) {
            print("The minimal height didn't rich");
        }
    }

    @Override
    public void landing() {
        if (height == heightMin) {
            height -= heightMin;
            print("Congratulations. You are on the land");
        } else {
            print("Your height is not suitable");
        }
    }

    @Override
    public void engineStop() {
        if (height == 0 && engineStarted) {
            engineStarted = false;
            print("The engine have been stopped");
        } else {
            print("You can't stop engine in the sky or the engine have not been started");
        }
    }
    
    protected void print(String message) {
        System.out.println("[" + name + "] - " + message);
    }
}
