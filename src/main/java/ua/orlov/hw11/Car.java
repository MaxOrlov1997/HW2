package ua.orlov.hw11;

public class Car {
    String series = "Nisan";
    String year = "2021";
    String color = "black";
    double tankSize = 24;
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
       double tanksizeIncar=tankSize-fuelConsumption;
        if(tanksizeIncar == 0 ){
            System.out.println("Нет топлива");
            return "";
        }
        return "Можно ехать, топливо есть";
    }
    public String res(){
        String res = ("Модель - " + series + " " + "Год -" + year + " " +"Цвет - " + color + " " +
                "Количество топлива - " + tankSize + " " + "Вид топлива -" + currentFuel + " "+
                "Потребление топлива - " + fuelConsumption);
        return res;
    }
    interface Recovery{

    }
}
