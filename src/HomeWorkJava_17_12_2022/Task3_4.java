package HomeWorkJava_17_12_2022;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Methods ourCalculator1 = new Methods(); // Напишите программу, которая вычисляет, сколько лишних калорий

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер пицы, диаметром больше 24 см");
        double diametr = scanner.nextInt();

        double resultPizza = ourCalculator1.Pizza(diametr);
        System.out.println("Площадь пиццы "+diametr+"см =: "+resultPizza+" см2");
        double Calories = resultPizza*40;
        System.out.println("В этой пицце содержится: " +Calories+" калорий");
        double Pizza24Callories = (24*24)/4 * Math.PI * 40;
        System.out.println("Площадь пиццы размером 24 см - "+(24*24)/4 * Math.PI+" см2");
        System.out.println("В пицце размером 24 см, содержится: " +Pizza24Callories+" калорий");
        double RaznicaCalorij = Calories - Pizza24Callories;
        System.out.println("В пицце"+diametr+"см содержится на " +RaznicaCalorij+" калорий больше, чем в пицце размером 24 см");
    }  // В пицце 28 см содержится на 2080 калорий больше, чем в пицце размером 24 см
        public double Pizza (double diametr) {   // Метод
        return (diametr * diametr) / 4 * Math.PI;                  // Площадь пиццы
    }


}
