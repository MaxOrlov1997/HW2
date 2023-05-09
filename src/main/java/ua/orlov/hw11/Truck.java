package ua.orlov.hw11;

import java.util.Scanner;

public class Truck extends Car {
    double cargo;

    public Truck(String series, String year, String color, double tankSize, double currentFuel, double fuelConsumption, double cargo) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
        this.cargo = cargo;
    }

    public Truck() {
        super();
    }

    public void submergeCargo(int cargoIncar) {
        cargo = cargoIncar;
            System.out.println("Груз успешно погружен " + cargo);
    }

    @Override
    public void move() {
        double stat = getRange();
        System.out.println("Автомобиль может проехать " + stat + " км");
        while (currentFuel > 0) {
            currentFuel = getCurrentFuelState();
            System.out.println("Можно ехать, топливо есть");
        }
        currentFuel = 0;
        System.out.println("Нет топлива");
        Scanner scan = new Scanner(System.in);
        String admin = scan.nextLine();
        if (admin.equals("Yes")) {
            isTankRefuel();
        } else System.out.println("Дозаправки не будет");
    }

    public double getCurrentFuelState() {
        return currentFuel - (fuelConsumption * 2);
    }

    private double getRange() {
        double stat = (this.currentFuel / (this.fuelConsumption * 2)) * 100;
        return stat;
    }

    public void unloadingCar(double cargoOut) {
        cargo = cargo - cargoOut;
        System.out.println("Груз в машине " + cargo);
    }
}

