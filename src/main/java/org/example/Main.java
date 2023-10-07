package org.example;

import org.example.coffeeMachines.Coffee11;
import org.example.coffeeMachines.Coffee21;
import org.example.coffeeMachines.Coffee31;
import org.example.views.View;
import org.example.views.Menu;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Coffee11 coffee11 = new Coffee11(1000,1000,1000);
        Coffee31 coffee31 = new Coffee31(1000, 1000, 1000, 1000, 1000);
        Coffee21 coffee21 = new Coffee21(1000,1000,1000,1000);
        Menu menu = new Menu(coffee11);
        Menu menu1 = new Menu(coffee31);
        Menu menu2 = new Menu(coffee21);
        view.start(menu1);
    }
}