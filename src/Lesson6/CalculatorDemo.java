package Lesson6;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator ourCalculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter X: ");
        int x = scanner.nextInt();

        System.out.println("Please enter Y: ");
        int y = scanner.nextInt();

        int resultAdd = ourCalculator.add(x,y);
        System.out.println("Add result is: " +resultAdd);

        int resultDeduct = ourCalculator.minus(x,y);
        System.out.println("Deduction result is: " +resultDeduct);

        int resultMult = ourCalculator.multiplication(x,y);
        System.out.println("Multiplication result is: " +resultMult);

    }
}
