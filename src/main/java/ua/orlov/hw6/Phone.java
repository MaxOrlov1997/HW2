package ua.orlov.hw6;

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
        System.out.println("Номер из getNamber - " + phone.getNumber());
        String Name = "Max";
        phone.receiveCall(Name);
        Phone firstphone = new Phone(phone.number, phone.model);
        firstphone.model = "Samsung";
        firstphone.number = "095";
        System.out.println(firstphone.model);
        System.out.println(firstphone.number);
        Phone secondPhone = new Phone(phone.number, phone.model, phone.weight);
        secondPhone.number = "096";
        secondPhone.model = "Acer";
        secondPhone.weight = "2.2kg";
        System.out.println(secondPhone.number);
        System.out.println(secondPhone.model);
        System.out.println(secondPhone.weight);
    }

    public void receiveCall(String Name) {
        System.out.println("Звонит " + Name);
    }

    public String getNumber() {
        return number;
    }

}




