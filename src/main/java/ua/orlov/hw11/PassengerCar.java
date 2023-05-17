package ua.orlov.hw11;

import java.util.Scanner;

public class PassengerCar extends Car {
    int passenger;

    public PassengerCar(String series, String year, String color, double tankSize, String currentFuel, double fuelConsumption, int passenger) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
        this.passenger = passenger;
    }

    public PassengerCar() {

    }

    public int putPassenger() {
        for (;;){
            System.out.println("Ведите количество пассажиров в машине, только положительные значения");
            Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
            System.out.println("Сколько хотите посадить в машину пассажиров?");
             int newPassenger = scan.nextInt();
            if (newPassenger + n <= 3) {
                passenger = n + newPassenger;
                return passenger;
            }
            System.out.println("Нет посадочных мест, автомобиль может вместить всего 3 пассажиров");
        }
    }
}
