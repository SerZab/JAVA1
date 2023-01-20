package Lessons.Lesson15;

import java.util.Arrays;
import java.util.Comparator;

public class SortExampleArray {
    public static void main(String[] args) {
        // Создаем массив целых чисел
        int[] intArray = {76,43,81,245,23344,-1, 0, -23};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println("-----------------");
        String[] stringArray = {"Maxim","Alex","Daria","Maxvel","Antonina","0Xana"};
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray,Comparator.reverseOrder());
        System.out.println(Arrays.toString(stringArray));
    }
}
