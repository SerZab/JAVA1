package HomeWork.HomeWork_17_12_2022;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для перевода в 2/3/4/5/6/7/8/9/16:");

        int number = scanner.nextInt();

        System.out.println("---------------------------------");
        System.out.println("Двоичная система - " + Integer.toBinaryString(number)); //первод в двочиную систему
        System.out.println("Троичную система - " +Integer.toString (number, 3));    //в 3-ичню
        System.out.println("4-ричную система - " +Integer.toString (number, 4));    //в 4-ичню
        System.out.println("5-ричную система - " +Integer.toString (number, 5));    //в 5-ичню
        System.out.println("6-ричную система - " +Integer.toString (number, 6));    //в 6-ичню
        System.out.println("7-ричную система - " +Integer.toString (number, 7));    //в 7-ичню
        System.out.println("Восьмиричная - " + Integer.toOctalString(number));  //в 8-ричную
        System.out.println("9-ричную система - " +Integer.toString (number, 9));    //в 9-ичню
        System.out.println("Шестнадцатиричная система - " +Integer.toHexString(number));    //в 16-тиричню
    }
}
