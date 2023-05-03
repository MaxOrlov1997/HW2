package ua.orlov.hw11;

public class PassengerCar extends Car {

    public PassengerCar(String series, String year, String color, double tankSize, double currentFuel, double fuelConsumption) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
    }

    public PassengerCar() {

    }

    public void putPassenger(int passenger) {
        for (; ; ) {
            if (passenger <= 3) {
                System.out.println("Посадка успешна, всего сидит " + passenger + " пассажиров");
                break;
            }
            System.out.println("Нет посадочных мест, автомобиль может вместить всего 3 пассажиров");
        }
    }
}

