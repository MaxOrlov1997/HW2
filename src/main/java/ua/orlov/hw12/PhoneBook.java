package ua.orlov.hw12;

import java.util.Optional;
import java.util.Scanner;

/*Реализовать метод поиска индекса телефона в массиве, если телефона нет - вернуть
пустой Optional.*/
public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        Optional<Integer> res = findIndexByPhoneNumber(phoneNumber);
        System.out.println(res);
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (phoneNumber.equals(PHONE_BOOK[i])) {
                return Optional.of(Integer.valueOf("Номер есть"));
            }
        }
        return Optional.empty();
    }
}
