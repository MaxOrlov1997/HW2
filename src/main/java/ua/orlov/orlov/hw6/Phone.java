package ua.orlov.orlov.hw6;

public class Phone {
    String number;
    String model;
    String weight;

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
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
        System.out.println(phone.getNumber(phone.number));
        String Name = "Max";
        phone.receiveCall(Name);
        System.out.println(phone.receiveCall("Звонит " + Name));
    }

    public String receiveCall(String Name) {
        return Name;
    }

    public String getNumber(String... args) {
        return this.number;
    }

}



