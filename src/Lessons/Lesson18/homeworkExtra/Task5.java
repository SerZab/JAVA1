package Lessons.Lesson18.homeworkExtra;

public class Task5 {
    /*
5. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
 Выведите массивы на экран в двух отдельных строках
 Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 -  создание массива -> входные данные - количество элементов -> выход - созданный массив - 2 раза
 -  заполнить массивы случайными данными  -> вход (ранее созданный массив, диапазон значений) -> выход (заполненный массив)
 -  вывод массива на экран
 -  посчитать среднее арифметическое
  -  вывод минфо на экран
     */

    public static void main(String[] args) {

        Task5Util task5Util = new Task5Util();

        int arraySize = 5;
        int startValue = 0;
        int endValue = 6;

        int[] workingArrayFirst = task5Util.fillArray(task5Util.createArray(arraySize),startValue, endValue );
        int[] workingArraySecond = task5Util.fillArray(task5Util.createArray(arraySize),startValue, endValue );

        task5Util.printArray(workingArrayFirst);
        task5Util.printArray(workingArraySecond);
        double averageValue1 = task5Util.averageValueCalculate(workingArrayFirst);
        System.out.println("Fist Array avarage = "+averageValue1);
        double averageValue2 = task5Util.averageValueCalculate(workingArraySecond);
        System.out.println("Second Array avarage = "+averageValue2);
        task5Util.printAverageInfo(averageValue1,averageValue2);
    }
}
