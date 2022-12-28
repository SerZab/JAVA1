package Lessons;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        Double number1;
        Double number2;
        Double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Выбери действие: +, -, *, Или /");
        operator = input.next().charAt(0);

        System.out.println("Введи первое число");
        number1 = input.nextDouble();

        System.out.println("Введи второЕ число");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println("Результат: "+ number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Результат: "+ number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Результат: "+ number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println("Результат: "+ number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Неправильный ввод");
                break;
        }

    }
}