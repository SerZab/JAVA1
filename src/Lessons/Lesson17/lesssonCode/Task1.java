package Lessons.Lesson17.lesssonCode;

import java.util.Arrays;

public class Task1 {
    /*
    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
     */
    public static void main(String[] args) {
        TaskUtil taskUtil = new TaskUtil();
        String[] calendar = {"January","February","March","April","May","June","July","August","September","October",
                "November","December"};
        System.out.println(Arrays.toString(calendar));
        System.out.println("reverseArray1");
        taskUtil.reverseArray1(calendar);
    }
}
