package HomeWork.HomeWork_17_12_2022;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Methods ourCalculator1 = new Methods();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число х");
        double x = scanner.nextInt();
        System.out.println("Введите число y");
        double y = scanner.nextInt();

        double resultAdd = ourCalculator1.addition(x,y);
        System.out.println("Сумма х и у =: " +resultAdd);
        double resultMin = ourCalculator1.deduction(x,y);
        System.out.println("Разница х и у =: " +resultMin);
        double resultMult = ourCalculator1.multiplication(x,y);
        System.out.println("Умножение х и у =: " +resultMult);
        double resultDiv = ourCalculator1.division(x,y);
        System.out.println("Деление х и у =: " +resultDiv);
    }
}
