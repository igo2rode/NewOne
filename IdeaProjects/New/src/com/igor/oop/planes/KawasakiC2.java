package com.igor.oop.planes;

public class KawasakiC2 extends AirplaneImpl implements AirplaneCargo{
    protected int weightMax;
    protected int weightMin;
    protected int weightDelta;
    protected int weight = 0;

    KawasakiC2(String name){
        super(name);
        weightMax = 35000;
        weightMin = 0;
        weightDelta = 5000;
    }

    public void takeOff() {
        if (engineStarted && weight <= weightMax){
            height = heightMin;
            print("Airplane took off. The height is 500");
            inTheSky = true;
        } else if (!engineStarted){
            print("Your engine is off. Please, start the engine");
        } else if (weight > weightMax) {
            print("The weight is more than maximum");
        }
    }
    public void load () {
        if (height == 0) {
            weight += weightDelta;
            print("weight :" + weight);
        } else {
            print("Height don't 0");
        }
     }

     public void unload () {
        if (height == 0) {
            if (weight > weightMin) {
                weight -= weightDelta;
                print("weight :" + weight);
            } else {
                print("Weight riches minimum ");
            }
        } else {
            print("Height don't 0");
        }
     }

    protected void print(String message) {
        System.out.println("[" + name + "] - " + message);
    }

}
