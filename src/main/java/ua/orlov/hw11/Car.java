package ua.orlov.hw11;

public class Car implements Recovery {
    String series;
    String year;
    String color;
    double tankSize;
    double currentFuel;
    double fuelConsumption;

    public Car(String series, String year, String color, double tankSize, double currentFuel, double fuelConsumption) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.tankSize = tankSize;
        this.currentFuel = currentFuel;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {

    }

    public String toString() {
        String res = ("Модель - " + series + " " + "Год -" + year + " " + "Цвет - " + color + " " +
                "Количество топлива - " + this.tankSize + " " + "Осталось в баке -" + this.currentFuel + " " +
                "Потребление топлива - " + fuelConsumption);
        return res;
    }

    public void move() {
        double stat = getRange();
        System.out.println("Автомобиль может проехать " + stat + " км");
        while (currentFuel > 0) {
            currentFuel = getCurrentFuelState();
            System.out.println("Можно ехать, топливо есть");
        }
        currentFuel = 0;
        System.out.println("Нет топлива");
        refuel();
    }

    private double getCurrentFuelState() {
        return currentFuel - fuelConsumption;
    }

    private double getRange() {
        double stat = (this.currentFuel / this.fuelConsumption) * 100;
        return stat;
    }

    public void printStatistics() {
        System.out.println("Ёмкость бака " + this.tankSize);
        System.out.println("Количество топлива в баке " + this.currentFuel);
    }

    public void refuel() {
        currentFuel = this.tankSize;
    }
}
