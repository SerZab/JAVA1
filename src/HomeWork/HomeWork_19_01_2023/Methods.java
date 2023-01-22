package HomeWork.HomeWork_19_01_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    // Task1
    public int Elements (int[] workingArray){ //простой метод возвращающий количество элементов массива
        int n = workingArray.length;
        return n;
    }
    public int missingElement (int[] workingArray, int n){
        // фактический размер `n+1`, так как в массиве отсутствует число
        int m = n + 1;
        // получить сумму целых чисел от 1 до `n+1`
        int total = m * (m + 1) / 2;
        System.out.println("Сумма полного ряда = "+total); //проверка
        // получаем реальную сумму целых чисел в массиве
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += workingArray[i];
        } // недостающее число - это разница между ожидаемой суммой
        System.out.println("Сумма чисел нашего массива = "+sum); //проверка
        // и фактическая сумма
        return total - sum;
    }
    // Task2
    public int scannerNew (String text) { //Запрос чисел у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }
    public int [] createArray (int n) { //создание массива Рандом
        int[] createArray = new int[n];
        for (int i = 0; i < createArray.length; i++) {
            createArray[i] = (int) (Math.random() * n);
        }
        return createArray;
    }
    public int findPairsInArray (int[] workingArray, int k){
        int pairs = 0;
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 1+i; j < workingArray.length; j++) {
                if((workingArray[i] + workingArray[j]) == k){
                    pairs++;
                }
            }
        }
        return pairs;
    }
    // Task3
    public String scannerCheck (String text) { //Запрос строк у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        while (!(scanner.hasNext ("=") | scanner.hasNext ("равно"))){ //проверка ввода данных (=, равно)
            System.out.println(text);
            scanner.nextLine();
        }
        return scanner.next();
    }

    public StringBuilder findUndReplaceCharToString (StringBuilder text, char s, String str1){ //метод замены символа на строки
        for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == s){
            text.deleteCharAt(i);
            text.insert((i),str1);}
        } return text;
    }
}