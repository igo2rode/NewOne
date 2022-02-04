package com.igor.oop.planes;

public interface Airplane {
    void engineStart();

    void engineStop();

    void takeOff();

    void heightIncrease();

    void heightDecrease();

    void landing();

    void engineTest();

    static Airplane create() {
        return new BellX1();
    }
}
