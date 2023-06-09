package ua.orlov.hw11;

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
        if (cargo != 0) {
            System.out.println("Груз уже есть в машине");
        } else {
            cargo = cargoIncar;
            System.out.println("Груз успешно погружен " + cargo);
        }
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
    }

    private double getCurrentFuelState() {
        return currentFuel - (fuelConsumption * 2);
    }

    private double getRange() {
        double stat = (this.currentFuel / (this.fuelConsumption * 2)) * 100;
        return stat;
    }

    public void unloadingCar() {
        if (cargo == 0) {
            System.out.println("Груза в машине нет");
        } else {
            System.out.println("Груз в машине " + cargo);
            cargo = 0;
        }
    }
}

