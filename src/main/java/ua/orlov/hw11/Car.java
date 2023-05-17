package ua.orlov.hw11;

import java.util.Scanner;

public class Car implements Recovery {
    String series = "Nisan";
    String year = "2021";
    String color = "black";
    double tankSize = 200;
    String currentFuel = "Disel";
    double fuelConsumption = 25;

    public Car(String series, String year, String color, double tankSize, String currentFuel, double fuelConsumption) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.tankSize = tankSize;
        this.currentFuel = currentFuel;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {

    }
    public String muving(){
       double tanksizeIncar=tankSize/fuelConsumption;
        if(tanksizeIncar == 0 ){
            System.out.println("Нет топлива");
            return "";
        }
        return "Можно ехать, топливо есть";
    }
    public String statistics(){
        double stat = this.tankSize/fuelConsumption;
        System.out.println("Автомобиль может проехать - " + stat + " км");
        double tanksizeNow=0;
        System.out.println("После этой поездки бак будет пуст - " + tanksizeNow);
        System.out.println("Желаете заправить после поездки? Yes/No");
        Scanner scan = new Scanner(System.in);
        String admin = scan.nextLine();
        if (admin.equals("Yes")) {
        refuil(tanksizeNow);}
        return "В путь";
    }
    public void refuil(double tanksizeNow){
        tanksizeNow=this.tankSize;
        System.out.println("В бак зальют - " + tanksizeNow);
    }
    public String res(){
        String res = ("Модель - " + series + " " + "Год -" + year + " " +"Цвет - " + color + " " +
                "Количество топлива - " + this.tankSize + " " + "Вид топлива -" + currentFuel + " "+
                "Потребление топлива - " + fuelConsumption);
        return res;
    }

}
