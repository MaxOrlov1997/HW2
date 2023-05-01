package ua.orlov.hw11;

import java.util.Scanner;

public class Car implements Recovery {
    String series = "Nisan";
    String year = "2021";
    String color = "black";
    double tankSize = 200;
    double currentFuel = 60;
    double fuelConsumption = 25;

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

    public void toMove() {
        double stat = (this.currentFuel / this.fuelConsumption) * 100;
        for (int i = 0; currentFuel > 0; i++) {
            currentFuel = currentFuel - fuelConsumption;
            System.out.println("Можно ехать, топливо есть");
        }
        System.out.println("Автомобиль может проехать " + stat + " км");
        System.out.println("Топливо закончилось");
    }

    public void statistics() {
        double tanksizeNow = 0;
        System.out.println("После этой поездки бак будет пуст - " + tanksizeNow);
        System.out.println("Желаете заправить после поездки? Yes/No");
        Scanner scan = new Scanner(System.in);
        String admin = scan.nextLine();
        if (admin.equals("Yes")) {
            refuel(tanksizeNow);
        }
    }

    public void refuel(double tanksizeNow) {
        currentFuel = this.tankSize;
        System.out.println("В бак зальют - " + currentFuel);
    }

    public String toString() {
        String res = ("Модель - " + series + " " + "Год -" + year + " " + "Цвет - " + color + " " +
                "Количество топлива - " + this.tankSize + " " + "Осталось в баке -" + currentFuel + " " +
                "Потребление топлива - " + fuelConsumption);
        return res;
    }
}
