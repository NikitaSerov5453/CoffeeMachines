package org.example.coffeeMachines;

public class Coffee11 extends CoffeeMachines{
    private int coffeeMachineVersion = 1;
    private int waterTankVolume;
    private int coffeeTankVolume;
    private int usedCoffeeTankVolume;
    private int waterTank = waterTankVolume;
    private int coffeeTank = coffeeTankVolume;
    private int usedCoffeeTank = 0;

    public Coffee11() {

    }

    public Coffee11(int waterTankVolume, int coffeeTankVolume, int usedCoffeeTankVolume) {
        this.waterTankVolume = waterTankVolume;
        this.coffeeTankVolume = coffeeTankVolume;
        this.usedCoffeeTankVolume = usedCoffeeTankVolume;
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

    public int getCoffeeMachineVersion() {
        return coffeeMachineVersion;
    }

    public int getUsedCoffeeTankVolume() {
        return usedCoffeeTankVolume;
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

    public void setUsedCoffeeTankVolume(int usedCoffeeTankVolume) {
        this.usedCoffeeTankVolume = usedCoffeeTankVolume;
    }

    @Override
    public int getUsedCoffeeTank() {
        return super.getUsedCoffeeTank();
    }
}
