package Baitap10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.now());
        System.out.println(order);

    }
}
