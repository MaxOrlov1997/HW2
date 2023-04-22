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

    public int putPassenger(){
        System.out.println("Ведите количество пасажиров в машине, только положительные значения");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Сколько хотите посадить в машину пасажиров?");
        int newPassenger = scan.nextInt();
        if (newPassenger+n>3){
            System.out.println("Нет посадочных мест, проверте коректность введённых данных");
            return 0;}
        passenger = n+newPassenger;
        return passenger;
    }
}
