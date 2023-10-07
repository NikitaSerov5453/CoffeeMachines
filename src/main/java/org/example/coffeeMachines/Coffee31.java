package org.example.coffeeMachines;

public class Coffee31 extends CoffeeMachines{
    private int coffeeMachineVersion = 3;
    private int waterTankVolume;
    private int milkTankVolume;
    private int coffeeTankVolume;
    private int usedCoffeeTankVolume;
    private int grainCoffeeTankVolume;
    private int grainCoffeeTank;
    private int waterTank = waterTankVolume;
    private int milkTank = milkTankVolume;
    private int coffeeTank = coffeeTankVolume;
    private int usedCoffeeTank = 0;

    public Coffee31() {

    }

    public Coffee31(int waterTankVolume, int coffeeTankVolume, int usedCoffeeTankVolume, int milkTankVolume, int grainCoffeeTankVolume) {
        this.waterTankVolume = waterTankVolume;
        this.coffeeTankVolume = coffeeTankVolume;
        this.usedCoffeeTankVolume = usedCoffeeTankVolume;
        this.milkTankVolume = milkTankVolume;
        this.grainCoffeeTankVolume = grainCoffeeTankVolume;
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
    public int getGrainCoffeeTankVolume() {
        return grainCoffeeTankVolume;
    }

    @Override
    public void setGrainCoffeeTankVolume(int grainCoffeeTankVolume) {
        this.grainCoffeeTankVolume = grainCoffeeTankVolume;
    }

    @Override
    public int getGrainCoffeeTank() {
        return grainCoffeeTank;
    }

    @Override
    public void setGrainCoffeeTank() {
        this.grainCoffeeTank = grainCoffeeTankVolume;
    }

    @Override
    public int getUsedCoffeeTank() {
        return usedCoffeeTank;
    }

    @Override
    public int getCoffeeMachineVersion() {
        return coffeeMachineVersion;
    }

    @Override
    public int getWaterTankVolume() {
        return waterTankVolume;
    }

    @Override
    public void setWaterTankVolume(int waterTankVolume) {
        this.waterTankVolume = waterTankVolume;
    }

    @Override
    public int getCoffeeTankVolume() {
        return coffeeTankVolume;
    }

    @Override
    public void setCoffeeTankVolume(int coffeeTankVolume) {
        this.coffeeTankVolume = coffeeTankVolume;
    }

    @Override
    public int getUsedCoffeeTankVolume() {
        return usedCoffeeTankVolume;
    }

    @Override
    public void setUsedCoffeeTankVolume(int usedCoffeeTankVolume) {
        this.usedCoffeeTankVolume = usedCoffeeTankVolume;
    }
    @Override
    public void grindCoffee() {
        if (coffeeTank - 22 < 0 && grainCoffeeTank >= 22) {
            grainCoffeeTank -=22;
            coffeeTank +=22;
        }
    }
}
