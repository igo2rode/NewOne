package com.igor.oop.planes;

import java.util.Scanner;

// TODO: Use Enum and Switch for options
public class Main {
    public static void main(String[] args) {
        Airplane airplane = Airplane.create();
        Scanner str = new Scanner(System.in);
        menu();
        int i = -1;
        while (i != 0){
            i = str.nextInt();
            if (i == 1) {
                airplane.engineStart();
            }
            else if (i == 2) {
                airplane.takeOff();
            }
            else if (i == 3) {
                airplane.heightIncrease();
            }
            else if (i == 4) {
                airplane.heightDecrease();
            }
            else if (i == 5) {
                airplane.landing();
            }
            else if (i == 6) {
                airplane.engineStop();
            }
            else if (i < 0 || i > 6){
                System.out.println("Choose correct number");
            }
        }
        System.out.println("Exit");
    }

    private static void menu() {
        System.out.println("Choose what to do: ");
        System.out.println("1 - start engine");
        System.out.println("2 - take off the land");
        System.out.println("3 - increase hight");
        System.out.println("4 - decrease hight");
        System.out.println("5 - landing");
        System.out.println("6 - stop engine");
        System.out.println("0 - exit");
    }
}
