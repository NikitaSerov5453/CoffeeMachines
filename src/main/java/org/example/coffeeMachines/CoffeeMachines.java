package org.example.coffeeMachines;

import org.example.views.Menu;

public abstract class CoffeeMachines {
    private int coffeeMachineVersion;
    private int waterTankVolume;
    private int coffeeTankVolume;
    private int grainCoffeeTankVolume;
    private int milkTankVolume;
    private int usedCoffeeTankVolume;
    private int waterTank;
    private int coffeeTank;
    private int grainCoffeeTank;
    private int milkTank;
    private int usedCoffeeTank;

    public void createEspresso() {
        this.coffeeTank -= 22;
        this.waterTank -= 30;
        this.usedCoffeeTank += 22;
    }

    public void createAmericano() {
        this.coffeeTank -= 22;
        this.waterTank -= 100;
        this.usedCoffeeTank += 22;
    }

    public void createLatte() {
        this.coffeeTank -= 22;
        this.waterTank -= 30;
        this.milkTank -= 40;
        this.usedCoffeeTank += 22;
    }

    public void createCappuccino() {
        this.coffeeTank -= 22;
        this.waterTank -= 30;
        this.milkTank -= 70;
        this.usedCoffeeTank += 22;
    }

    private Menu menu = new Menu();

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void coffeeReset() {
        this.usedCoffeeTank = 0;
    }

    public int getWaterTank() {
        return waterTank;
    }

    public void setWaterTank() {
        this.waterTank = waterTankVolume - waterTank;
    }

    public int getCoffeeTank() {
        return coffeeTank;
    }

    public void setCoffeeTank() {
        this.coffeeTank = coffeeTankVolume - coffeeTank;
    }

    public int getMilkTankVolume() {
        return milkTankVolume;
    }

    public void setMilkTankVolume(int milkTankVolume) {
        this.milkTankVolume = milkTankVolume;
    }

    public int getMilkTank() {
        return milkTank;
    }

    public void setMilkTank() {

    }

    public int getGrainCoffeeTankVolume() {
        return grainCoffeeTankVolume;
    }

    public void setGrainCoffeeTankVolume(int grainCoffeeTankVolume) {
        this.grainCoffeeTankVolume = grainCoffeeTankVolume;
    }

    public int getGrainCoffeeTank() {
        return grainCoffeeTank;
    }

    public void setGrainCoffeeTank() {
        this.grainCoffeeTank = grainCoffeeTankVolume;
    }

    public int getUsedCoffeeTank() {
        return usedCoffeeTank;
    }

    public int getCoffeeMachineVersion() {
        return coffeeMachineVersion;
    }

    public void setCoffeeMachineVersion(int coffeeMachineVersion) {
        this.coffeeMachineVersion = coffeeMachineVersion;
    }

    public int getWaterTankVolume() {
        return waterTankVolume;
    }

    public void setWaterTankVolume(int waterTankVolume) {
        this.waterTankVolume = waterTankVolume;
    }

    public int getCoffeeTankVolume() {
        return coffeeTankVolume;
    }

    public void setCoffeeTankVolume(int coffeeTankVolume) {
        this.coffeeTankVolume = coffeeTankVolume;
    }

    public int getUsedCoffeeTankVolume() {
        return usedCoffeeTankVolume;
    }

    public void setUsedCoffeeTankVolume(int usedCoffeeTankVolume) {
        this.usedCoffeeTankVolume = usedCoffeeTankVolume;
    }

    public void setWaterTank(int waterTank) {
        this.waterTank = waterTank;
    }

    public void setCoffeeTank(int coffeeTank) {
        this.coffeeTank = coffeeTank;
    }

    public void setMilkTank(int milkTank) {
        this.milkTank = milkTank;
    }

    public void setUsedCoffeeTank(int usedCoffeeTank) {
        this.usedCoffeeTank = usedCoffeeTank;
    }
}
