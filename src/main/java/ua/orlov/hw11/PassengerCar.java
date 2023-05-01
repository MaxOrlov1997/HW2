package ua.orlov.hw11;

import java.util.Scanner;

public class PassengerCar extends Car {
    int passenger;

    public PassengerCar(String series, String year, String color, double tankSize, double currentFuel, double fuelConsumption, int passenger) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
        this.passenger = passenger;
    }

    public PassengerCar() {

    }

    public void putPassenger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько хотите посадить в машину пассажиров?");
        for (; ; ) {
            int newPassenger = scan.nextInt();
            if (newPassenger <= 3) {
                System.out.println("Посадка успешна, всего сидит " + newPassenger + " пассажиров");
                break;
            }
            System.out.println("Нет посадочных мест, автомобиль может вместить всего 3 пассажиров");
        }
    }
}

