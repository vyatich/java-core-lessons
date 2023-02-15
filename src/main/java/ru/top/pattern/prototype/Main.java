package ru.top.pattern.prototype;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название");
        String name = scanner.nextLine();
        System.out.println("Введите описание");
        String description = scanner.nextLine();
        System.out.println("Введите стоимость");
        String price = scanner.nextLine();
        System.out.println("Введите модель");
        String model = scanner.nextLine();

        Phone phone = new Phone();
        phone.setName(name);
        phone.setDescription(description);
        phone.setPrice(new BigDecimal(price));
        phone.setModel(model);

        System.out.println(phone);

        Phone clone = null;
        try {
            clone = (Phone) phone.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(clone);
    }
}
