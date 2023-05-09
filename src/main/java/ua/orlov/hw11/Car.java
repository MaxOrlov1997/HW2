package ua.orlov.hw11;

import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        String admin = scan.nextLine();
        if (admin.equals("Yes")) {
            isTankRefuel();
        } else System.out.println("Дозаправки не будет");
    }

    public double getCurrentFuelState() {
        return currentFuel - fuelConsumption;
    }

    private double getRange() {
        double stat = (this.currentFuel / this.fuelConsumption) * 100;
        return stat;
    }

    public void statistics() {
        System.out.println("Ёмкость бака " + this.tankSize);
        System.out.println("Количество топлива в баке " + this.currentFuel);
    }

    public void isTankRefuel() {
        currentFuel = this.tankSize - this.currentFuel;
        System.out.println("В бак зальют - " + currentFuel);
    }
}
