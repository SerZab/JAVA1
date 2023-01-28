package Lessons.Lesson18.homeworkExtra;

import java.util.Arrays;
    public class Task4 {
    /*
4. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
 Выведите массив на экран в строку
 Замените каждый элемент с нечётным индексом на ноль
 Снова выведете массив на экран на отдельной строке
 -  создание массива -> входные данные - количество элементов -> выход - созданный массив
 -  заполнить массив случайными данными  -> вход (ранее созданный массив, диапазон значений) -> выход (заполненный массив)
 -  вывод массива на экран
 -  заменить нечетные индексы на 0
  -  вывод массива на экран
     */

        public static void main(String[] args) {

            Task4Util task4Util = new Task4Util();

            int arraySize = 12;
            int startValue = 1;
            int endValue = 10;

            int[] workingArray = task4Util.fillArray(task4Util.createArray(arraySize),startValue, endValue );

            task4Util.printArray(workingArray);
            int[] changedArray = task4Util.changeOddIndexToZero(workingArray);
            task4Util.printArray(changedArray);
        }
}
