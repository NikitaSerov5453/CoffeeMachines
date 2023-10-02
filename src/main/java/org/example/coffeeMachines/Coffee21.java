package org.example.coffeeMachines;

public class Coffee21 extends CoffeeMachines{
    private int coffeeMachineVersion = 2;
    private int waterTankVolume;
    private int milkTankVolume;
    private int coffeeTankVolume;
    private int usedCoffeeTankVolume;
    private int waterTank = waterTankVolume;
    private int milkTank = milkTankVolume;
    private int coffeeTank = coffeeTankVolume;
    private int usedCoffeeTank = 0;

    public Coffee21() {

    }

    public Coffee21(int waterTankVolume, int coffeeTankVolume, int usedCoffeeTankVolume, int milkTankVolume) {
        this.waterTankVolume = waterTankVolume;
        this.coffeeTankVolume = coffeeTankVolume;
        this.usedCoffeeTankVolume = usedCoffeeTankVolume;
        this.milkTankVolume = milkTankVolume;
    }

    @Override
    public void createEspresso() {
        this.coffeeTank -= 22;
        this.waterTank -= 30;
        this.usedCoffeeTank += 22;
    }

    @Override
    public void createAmericano() {
        this.coffeeTank -= 22;
        this.waterTank -= 100;
        this.usedCoffeeTank += 22;
    }

    @Override
    public void createLatte() {
        this.coffeeTank -= 22;
        this.waterTank -= 30;
        this.milkTank -= 40;
        this.usedCoffeeTank += 22;
    }

    @Override
    public void createCappuccino() {
        this.coffeeTank -= 22;
        this.waterTank -= 30;
        this.milkTank -= 70;
        this.usedCoffeeTank += 22;
    }

    @Override
    public void coffeeReset() {
        this.usedCoffeeTank = 0;
    }

    @Override
    public int getWaterTank() {
        return waterTank;
    }

    @Override
    public void setWaterTank() {
        this.waterTank = waterTankVolume;
    }

    @Override
    public int getCoffeeTank() {
        return coffeeTank;
    }

    @Override
    public void setCoffeeTank() {
        this.coffeeTank = coffeeTankVolume;
    }

    @Override
    public int getMilkTankVolume() {
        return milkTankVolume;
    }

    @Override
    public void setMilkTankVolume(int milkTankVolume) {
        this.milkTankVolume = milkTankVolume;
    }

    @Override
    public int getMilkTank() {
        return milkTank;
    }

    @Override
    public void setMilkTank() {
        this.milkTank = milkTankVolume;
    }

    @Override
    public int getUsedCoffeeTank() {
        return super.getUsedCoffeeTank();
    }

    public int getCoffeeMachineVersion() {
        return coffeeMachineVersion;
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
}
