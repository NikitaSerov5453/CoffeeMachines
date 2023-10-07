package org.example.views;

import org.example.coffeeMachines.CoffeeMachines;

import java.util.Scanner;

public class Menu {
    private CoffeeMachines coffeeMachines;
    private View view = new View();
    private final Scanner scanner = new Scanner(System.in);

    public Menu() {

    }

    public Menu(CoffeeMachines coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public void setCoffeeMachines(CoffeeMachines coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public CoffeeMachines getCoffeeMachines() {
        return coffeeMachines;
    }

    public void menuController() {
        if (coffeeMachines.getCoffeeMachineVersion() == 1) {
            menu01();
        } else if (coffeeMachines.getCoffeeMachineVersion() == 2) {
            menu02();
        } else if (coffeeMachines.getCoffeeMachineVersion() == 3) {
            menu03();
        }
    }

    public void onOff1(int i) {
        switch (i) {
            case 1 -> {
                menu11();
            }
            case 2 -> {
                menu01();
            }
            case 3 -> {
                return;
            }
            case 4 -> {
                coffeeMachines.setCoffeeTank();
                coffeeMachines.setWaterTank();
                printTank1();
                menu01();
            }
            default -> System.out.println("Неверно выбран пункт");
        }
    }

    public void onOff2(int i) {
        switch (i) {
            case 1 -> {
                menu21();
            }
            case 2 -> {
                menu02();
            }
            case 3 -> {
                return;
            }
            case 4 -> {
                coffeeMachines.setCoffeeTank();
                coffeeMachines.setWaterTank();
                coffeeMachines.setMilkTank();
                printTank2();
                menu02();
            }
            default -> System.out.println("Неверно выбран пункт");
        }
    }

    public void onOff3(int i) {
        switch (i) {
            case 1 -> {
                menu31();
            }
            case 2 -> {
                menu03();
            }
            case 3 -> {
                return;
            }
            case 4 -> {
                coffeeMachines.setGrainCoffeeTank();
                coffeeMachines.setWaterTank();
                coffeeMachines.setMilkTank();
                printTank2();
                menu03();
            }
            default -> System.out.println("Неверно выбран пункт");
        }
    }

    public void coffeeMachineMenu1(int i) {
        switch (i) {
            case 1 -> {
                menu11();
            }
            case 2 -> {
                menu01();
            }
            case 3 -> {
                errorEspressoCheck();
                printTank1();
                menu11();
            }
            case 4 -> {
                errorAmericanoCheck();
                printTank1();
                menu11();
            }
            case 5 -> {
                System.out.println("Очистка отработанного кофе");
                coffeeMachines.coffeeReset();
                menu11();
            }

            default -> System.out.println("Неверно выбран пункт");
        }
    }

    public void coffeeMachineMenu2(int i) {
        switch (i) {
            case 1 -> {
                menu21();
            }
            case 2 -> {
                menu02();
            }
            case 3 -> {
                errorEspressoCheck();
                printTank2();
                menu21();
            }
            case 4 -> {
                errorAmericanoCheck();
                printTank2();
                menu21();
            }
            case 5 -> {
                errorLatteCheck();
                printTank2();
                menu21();
            }
            case 6 -> {
                errorCappuccinoCheck();
                printTank2();
                menu21();
            }
            case 7 -> {
                System.out.println("Очистка отработанного кофе");
                coffeeMachines.coffeeReset();
                menu21();
            }

            default -> System.out.println("Неверно выбран пункт");
        }
    }

    public void coffeeMachineMenu3(int i) {
        switch (i) {
            case 1 -> {
                menu31();
            }
            case 2 -> {
                menu03();
            }
            case 3 -> {
                coffeeMachines.grindCoffee();
                errorAmericanoCheck1();
                printTank2();
                menu31();
            }
            case 4 -> {
                coffeeMachines.grindCoffee();
                errorLatteCheck1();
                printTank2();
                menu31();
            }
            case 5 -> {
                System.out.println("Очистка отработанного кофе");
                coffeeMachines.coffeeReset();
                menu31();
            }

            default -> System.out.println("Неверно выбран пункт");
        }
    }

    public void menu01() {
        System.out.println("1: Включить\n" +
                "2: Выключить \n" +
                "3: Завершить программу\n" +
                "4: Заполнить кофе машину");
        onOff1(scanner.nextInt());
    }

    public void menu02() {
        System.out.println("1: Включить\n" +
                "2: Выключить \n" +
                "3: Завершить программу\n" +
                "4: Заполнить кофе машину");
        onOff2(scanner.nextInt());
    }

    public void menu03() {
        System.out.println("1: Включить\n" +
                "2: Выключить \n" +
                "3: Завершить программу\n" +
                "4: Заполнить кофе машину");
        onOff3(scanner.nextInt());
    }

    public void menu11() {
        System.out.println("1: Включить\n" +
                "2: Выключить\n" +
                "3: Эспрессо\n" +
                "4: Американо\n" +
                "5: Очистка отработанного кофе");
        coffeeMachineMenu1(scanner.nextInt());
    }

    public void menu21() {
        System.out.println("1: Включить\n" +
                "2: Выключить\n" +
                "3: Эспрессо\n" +
                "4: Американо\n" +
                "5: Латте\n" +
                "6: Капучино\n" +
                "7: Очистка отработанного кофе");
        coffeeMachineMenu2(scanner.nextInt());
    }

    public void menu31() {
        System.out.println("1: Включить\n" +
                "2: Выключить\n" +
                "3: Американо\n" +
                "4: Латте\n" +
                "5: Очистка отработанного кофе");
        coffeeMachineMenu3(scanner.nextInt());
    }

    private void errorEspressoCheck() {
        if (coffeeMachines.getCoffeeTank() - 22 < 0) {
            view.errGroundedCoffee();
        } else if (coffeeMachines.getWaterTank() - 30 < 0) {
            view.errWater();
        } else if (coffeeMachines.getUsedCoffeeTank() + 22 > coffeeMachines.getUsedCoffeeTankVolume()) {
            view.errTankUsedCoffee();
        } else {
            System.out.println("Эспрессо");
            coffeeMachines.createEspresso();
        }
    }

    private void errorAmericanoCheck() {
        if (coffeeMachines.getCoffeeTank() - 22 < 0) {
            view.errGroundedCoffee();
        } else if (coffeeMachines.getWaterTank() - 100 < 0) {
            view.errWater();
        } else if (coffeeMachines.getUsedCoffeeTank() + 22 > coffeeMachines.getUsedCoffeeTankVolume()) {
            view.errTankUsedCoffee();
        } else {
            System.out.println("Американо");
            coffeeMachines.createAmericano();
        }
    }

    private void errorLatteCheck() {
        if (coffeeMachines.getCoffeeTank() - 22 < 0) {
            view.errGroundedCoffee();
        } else if (coffeeMachines.getWaterTank() - 30 < 0) {
            view.errWater();
        } else if (coffeeMachines.getUsedCoffeeTank() + 22 > coffeeMachines.getUsedCoffeeTankVolume()) {
            view.errTankUsedCoffee();
        } else if (coffeeMachines.getMilkTank() - 40 < 0) {
            view.errMilk();
        } else {
            System.out.println("Латте");
            coffeeMachines.createLatte();
        }
    }

    private void errorCappuccinoCheck() {
        if (coffeeMachines.getCoffeeTank() - 22 < 0) {
            view.errGroundedCoffee();
        } else if (coffeeMachines.getWaterTank() - 30 < 0) {
            view.errWater();
        } else if (coffeeMachines.getUsedCoffeeTank() + 22 > coffeeMachines.getUsedCoffeeTankVolume()) {
            view.errTankUsedCoffee();
        } else if (coffeeMachines.getMilkTank() - 70 < 0) {
            view.errMilk();
        } else {
            System.out.println("Капучино");
            coffeeMachines.createCappuccino();
        }
    }

    private void errorAmericanoCheck1() {
        if (coffeeMachines.getCoffeeTank() - 22 < 0 && coffeeMachines.getGrainCoffeeTank() < 22) {
            view.errGroundedCoffee();
        } else if (coffeeMachines.getWaterTank() - 100 < 0) {
            view.errWater();
        } else if (coffeeMachines.getUsedCoffeeTank() + 22 > coffeeMachines.getUsedCoffeeTankVolume()) {
            view.errTankUsedCoffee();
        } else {
            System.out.println("Американо");
            coffeeMachines.createAmericano();
        }
    }

    private void errorLatteCheck1() {
        if (coffeeMachines.getCoffeeTank() - 22 < 0 && coffeeMachines.getGrainCoffeeTank() < 22) {
            view.errGroundedCoffee();
        } else if (coffeeMachines.getWaterTank() - 30 < 0) {
            view.errWater();
        } else if (coffeeMachines.getUsedCoffeeTank() + 22 > coffeeMachines.getUsedCoffeeTankVolume()) {
            view.errTankUsedCoffee();
        } else if (coffeeMachines.getMilkTank() - 40 < 0) {
            view.errMilk();
        } else {
            System.out.println("Латте");
            coffeeMachines.createLatte();
        }
    }

    private void printTank1() {
        System.out.println("Кофе в баке: " + coffeeMachines.getCoffeeTank() +
                "\nВоды в баке: " + coffeeMachines.getWaterTank());
    }

    private void printTank2() {
        if (coffeeMachines.getGrainCoffeeTankVolume() == 0) {
            System.out.println("Кофе в баке: " + coffeeMachines.getCoffeeTank() +
                    "\nВоды в баке: " + coffeeMachines.getWaterTank() +
                    "\nМолока в баке: " + coffeeMachines.getMilkTank());
        } else {
            System.out.println("Кофе в баке: " + coffeeMachines.getGrainCoffeeTank() +
                    "\nВоды в баке: " + coffeeMachines.getWaterTank() +
                    "\nМолока в баке: " + coffeeMachines.getMilkTank());
        }
    }

    private void printTank() {
        System.out.printf("%s%s", "Кофе в баке: " + coffeeMachines.getCoffeeTank(), "\nВоды в баке: " + coffeeMachines.getWaterTank() +
                "\nМолока в баке: " + coffeeMachines.getMilkTank() + "\n");
    }

    public void start(Menu menu) {
        menu.menuController();
    }
}
