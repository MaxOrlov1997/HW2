package ua.orlov.hw11;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println(car.toString());
        car.statistics();
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.putPassenger(3);
        Truck truck = new Truck();
        truck.move();
        truck.submergeCargo(200, 500);
        truck.unloadingCar(300);
    }
}
