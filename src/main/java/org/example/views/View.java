package org.example.views;

import java.util.Scanner;

public class View {

    Error error = new Error();

    public View() {

    }

    protected void errWater() {
        System.out.println(error.ERROR_WATER);
    }

    protected void errGroundedCoffee() {
        System.out.println(error.ERROR_GROUND_COFFEE);
    }

    protected void errTankUsedCoffee() {
        System.out.println(error.ERROR_TANK_USED_COFFEE_IS_FULL);
    }

    protected void errMilk() {
        System.out.println(error.ERROR_MILK);
    }

    protected void errGrainCoffee() {
        System.out.println(error.ERROR_GRAIN_COFFEE);
    }



    public void err() {

    }

    public void start(Menu menu) {
        menu.menuController();
    }


}
