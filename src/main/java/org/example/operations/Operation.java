package org.example.operations;

import org.example.coffeeMachines.Coffee11;
import org.example.views.Menu;

public class Operation {

    public Operation() {

    }

    public Menu menu(Coffee11 coffee11) {
        Menu menu = new Menu();
        menu.setCoffeeMachines(coffee11);
        return menu;
    }



}
