package ua.orlov.hw11;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.muving());
        System.out.println(car.res());
        PassengerCar passengerCar = new PassengerCar();
        System.out.println("Количесвто пасажиров в машине - " + passengerCar.putPassenger());
        Truck truck = new Truck();
        System.out.println("Груз в машине - " + truck.submergeCargo());
        System.out.println(truck.muving());
    }
}
