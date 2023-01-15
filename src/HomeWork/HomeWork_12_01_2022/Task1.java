package HomeWork.HomeWork_12_01_2022;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int [] array = new int[8]; //Создайте массив из 8 случайных целых чисел из интервала [1;50]
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* 50) +1;
        }
        System.out.println(Arrays.toString(array)); //Выведите массив на экран в строку
        
        System.out.println("Заменяем каждый элемент с нечётным индексом на ноль");

        for (int i = 0; i < array.length; i++) { // Замените каждый элемент с нечётным индексом на ноль
        if (i % 2 == 0) { array[i] = 0; }}
        System.out.println(Arrays.toString(array)); //Снова выведете массив на экран на отдельной строке
    }
}
