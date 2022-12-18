package HomeWorkJava_17_12_2022;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Methods ourCalculator1 = new Methods(); // Напишите программу, которая вычисляет, сколько лишних калорий

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер пицы, диаметром больше 24 см");
        int x = scanner.nextInt();


        int resultPizza = ourCalculator1.Pizza(x);
        System.out.println("Площадь пиццы =: " +resultPizza+" см2");
        int Calories = resultPizza*40;
        System.out.println("В этой пицце содержится: " +Calories+" калорий");
        int Pizza24Callories = (24*24)/4*40;
        System.out.println("В пицце размером 24 см, содержится: " +Pizza24Callories+" калорий");
        int RaznicaCalorij = Calories - Pizza24Callories;
        System.out.println("В этой пицце содержится на " +RaznicaCalorij+" калорий больше, чем в пицце размером 24 см");
    }  // В пицце 28 см содержится на 2080 калорий больше, чем в пицце размером 24 см
}
