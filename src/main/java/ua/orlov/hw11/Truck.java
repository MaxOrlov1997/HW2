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

    public void submergeCargo() {
        System.out.println("Сколько груза в автомобиле изначально?");
        Scanner scan = new Scanner(System.in);
        double cargoOncar = scan.nextDouble();
        System.out.println("Сколько хотите погрузить?");
        double cargoIncar = scan.nextDouble();
        double cargo = cargoIncar + cargoOncar;
        unloadingCar(cargo);
    }

    @Override
    public void toMove() {
        double stat = (this.currentFuel / this.fuelConsumption * 2) * 100;
        for (int i = 0; currentFuel > 0; i++) {
            currentFuel = currentFuel - fuelConsumption;
            System.out.println("Можно ехать, топливо есть");
        }
        System.out.println("Автомобиль может проехать " + stat + " км");
        System.out.println("Топливо закончилось");
    }

    public void putPassengerTruck() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько хотите посадить в трак пассажиров?");
        int newPassenger = scan.nextInt();
        for (; ; ) {
            if (newPassenger <= 3) {
                System.out.println("Посадка успешна, всего сидит " + newPassenger + " пассажиров");
                break;
            }
            System.out.println("Нет посадочных мест, трак может вместить всего 3 пассажиров");
        }
    }

    public void unloadingCar(double cargo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько хотите выгрузить?");
        double cargoOut = scan.nextDouble();
        cargo = cargo - cargoOut;
        if (cargo <= 0) {
            System.out.println("Не возможно выгрузить, нет столько груза");
        }
        System.out.println("Осталось груза в машине - " + cargo);
    }
}

