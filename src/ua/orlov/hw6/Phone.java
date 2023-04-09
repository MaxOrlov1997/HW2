package ua.orlov.hw6;

public class Phone {
    String number;
    String model;
    String weight;
    String receiveCall;
    String getNumber;

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                ", receiveCall='" + receiveCall + '\'' +
                ", getNumber='" + getNumber + '\'' +
                '}';
    }

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void main(String... args) {
        Phone phone = new Phone();
        phone.number = "554455";
        phone.model = "Acer";
        phone.weight = "5.5kg";
        System.out.println(phone.number);
        System.out.println(phone.model);
        System.out.println(phone.weight);
        System.out.println(getNumber(phone.number));
        System.out.println(receiveCall(phone.receiveCall));
    }

    public static String receiveCall(String... args) {
        Phone phone = new Phone();
        phone.receiveCall = "Звонит Мax";
        return phone.receiveCall;
    }

    public static String getNumber(String... args) {
        Phone phone = new Phone();
        phone.number = "55445544";
        return phone.number;
    }

}



