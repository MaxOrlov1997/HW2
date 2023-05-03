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

    public void submergeCargo(int cargoIncar, int cargoOncar) {
        cargo = cargoIncar + cargoOncar;
        if (cargo > 1000) {
            System.out.println("Не возможно взять больше 1000, необходима разгрузка");
        } else
            System.out.println("Груз успешно погружен " + cargo);
    }

    @Override
    public void move() {
        double stat = (this.currentFuel / (this.fuelConsumption * 2)) * 100;
        System.out.println("Автомобиль может проехать " + stat + " км");
        for (int i = 0; currentFuel > 0; i++) {
            currentFuel = currentFuel - (fuelConsumption * 2);
            System.out.println("Можно ехать, топливо есть");
        }
        currentFuel = 0;
        System.out.println("Топливо закончилось");
        System.out.println("Желаете заправить после поездки? Yes/No");
        Scanner scan = new Scanner(System.in);
        String admin = scan.nextLine();
        if (admin.equals("Yes")) {
            refuel();
        } else System.out.println("Дозаправки не будет");
    }

    public void unloadingCar(double cargoOut) {
        cargo = cargo - cargoOut;
        if (cargo <= cargoOut) {
            System.out.println("Не возможно выгрузить, нет столько груза");
        }
        System.out.println("Осталось груза в машине - " + cargo);
    }
}

