package ua.orlov.hw6;

public class TestreceiveCall {


    public static void main(String... args) {
        Phone phone = new Phone();
        phone.receiveCall = "Мax";
        System.out.println("Звонит " + phone.receiveCall);
    }

}