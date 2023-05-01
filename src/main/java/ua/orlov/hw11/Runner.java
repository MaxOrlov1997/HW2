package ua.orlov.hw11;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.toMove();
        System.out.println(car.toString());
        car.statistics();
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.putPassenger();
        Truck truck = new Truck();
        truck.submergeCargo();
        truck.toMove();
        truck.putPassengerTruck();
    }
}
