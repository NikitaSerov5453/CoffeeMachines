package org.example.views;

import java.util.Scanner;

public class View {

    Error error = new Error();

    public View() {

    }

    private void errWater() {
        System.out.println(error.ERROR_WATER);
    }

    private void errGroundedCoffee() {
        System.out.println(error.ERROR_GROUND_COFFEE);
    }

    private void errTankUsedCoffee() {
        System.out.println(error.ERROR_TANK_USED_COFFEE_IS_FULL);
    }

    private void errMilk() {
        System.out.println(error.ERROR_MILK);
    }

    private void errGrainCoffee() {
        System.out.println(error.ERROR_GRAIN_COFFEE);
    }

    public void err() {

    }

    public void start(Menu menu) {
        menu.menuController();
    }


}
