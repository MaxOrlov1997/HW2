package ua.orlov.hw11;

import java.util.Scanner;

public class Truck extends Car{
    double cargo;

    public Truck(String series, String year, String color, double tankSize, String currentFuel, double fuelConsumption, double cargo) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
        this.cargo = cargo;
    }

    public Truck() {
        super();
    }

    public double submergeCargo(){
        System.out.println("Сколько груза в автомобиле изначально?");
        Scanner scan = new Scanner(System.in);
        double cargoOncar=scan.nextDouble();
        System.out.println("Сколько хотите погрузить?");
        double cargoIncar = scan.nextDouble();
        System.out.println("Сколько хотите выгрузить?");
        double cargoOut= scan.nextDouble();
        cargo = cargoOncar + cargoIncar - cargoOut;
        if (cargo<=0){
            System.out.println("Не возможно выгрузить, нет столько груза");
            return 0;
        }
        return cargo;
    }
    @Override
    public String muving(){
        this.tankSize=this.tankSize-(this.fuelConsumption * 2);
        if(tankSize == 0 ){
            System.out.println("Нет топлива");
            return "";
        }
        return "Можно ехать";
    }
}
