package HomeWork.HomeWork_19_01_2023;

import java.util.Arrays;

public class Task2 {
    /*
    Дан массив из N целых чисел и целое число  K,
    найдите количество пар элементов в массиве, сумма которых равна K.
     */
    public static void main(String[] args) {

        Methods methods = new Methods();
        int n = methods.scannerNew("Введите количество элементов массива целых чисел N");
        int k = methods.scannerNew("Введите число K, для определения количество пар элементов в массиве");
        int[] workingArray = methods.createArray(n);
        System.out.println(Arrays.toString(workingArray));

        int pairs = methods.findPairsInArray(workingArray,k);
        System.out.println("Количество пар - "+pairs+", которые равные К ("+k+").");
    }
}
