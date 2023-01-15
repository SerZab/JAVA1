package HomeWork.HomeWork_12_01_2022;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] array1 = new int[5]; //Создайте массив из 5 случайных целых чисел из интервала [10;99]

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()* 89) + 10; //[10;99]
        }
        System.out.println(Arrays.toString(array1)); //Выведите его на экран в строку.

        //Что такое строго возрастающая последовательность?
        //каждый следующий элемент массива больше предыдущего

        boolean flag = true; //если следующий элемент массива меньше или равен предыдущему, тогда установить флаг false

        for (int i = 1; i < array1.length; i++) {
            if(array1[i]<=array1[i-1]){
                flag = false;
                break; //// выйти из цикла
            }
        }
        if(flag){
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
