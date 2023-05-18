package ua.orlov.hw11;

public class PassengerCar extends Car {
    int passengerInCar = 2;

    public PassengerCar(String series, String year, String color, double tankSize, double currentFuel, double fuelConsumption) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
    }

    public PassengerCar() {

    }

    public void putPassenger() {
        int passenger = passengerInCar + 1;
        if (passenger <= 3) {
            passengerInCar=passenger;
            System.out.println("В автомобиле сидит " + passengerInCar + " пассажиров");
        } else {
            System.out.println("Нет посадочных мест, автомобиль может вместить всего 3 пассажиров");
        }
    }
}

