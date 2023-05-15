package ua.orlov.hw11;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Nisan", "2021", "black", 200, 60, 25);
        car.move();
        System.out.println(car.toString());
        car.printStatistics();
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.putPassenger(1, 3);
        Truck truck = new Truck("Nisan", "2021", "black", 200, 60, 25, 0);
        truck.move();
        truck.submergeCargo(500);
        truck.unloadingCar();
    }
}
