package HomeWork.HomeWork_18_12_2022;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {  // конвертирует указанную сумму в евро в сумму в долларах США
        Methods ourCalculator1 = new Methods();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в Евро");
        double x = scanner.nextInt();

        double ValutaDollar = ourCalculator1.Valuta(x);
        System.out.println("Сумма в Долларах = "+ValutaDollar+" $");
    }
}
