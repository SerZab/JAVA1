package HomeWork.HomeWork_22_12_2022;

import java.util.Scanner;

public class EdekaRewe {
    public static void main(String[] args) {    //Создайте две переменные isEdekaOpen и isReweOpen, значения которых
                                                // зависят от того, открыты магазины или нет.

        boolean isEdekaOpen = Methods.scannerNew1("Is supermarket Edeka open (true or false)?");
        boolean isReweOpen = Methods.scannerNew1("Is supermarket Rewe open (true or false)?");

        boolean canBuy = isEdekaOpen || isReweOpen; // реализуем переменную покупки
        if (canBuy == true){
            System.out.println("Я могу сегодня купить еду");
        } else {
            System.out.println("Я не могу сегодня купить еду");
        }
    }
}
