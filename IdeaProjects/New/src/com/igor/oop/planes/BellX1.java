package com.igor.oop.planes;

public class BellX1 extends AirplaneImpl {
    public BellX1() {
        super("Bell X-1");
        speedDelta = 100;
        speedMax = 1600;
        speedMin = 600;
        heightMax = 10000;
        heightDelta = 50;
    }

    @Override
    public void engineTest() {
        if( ! engineStarted) {
            print("Testing engines, engine #1 - works fine, ready to start");
        } else {
            print("Engines already started!");
        }
    }
}
