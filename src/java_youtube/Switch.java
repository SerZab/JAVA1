package java_youtube;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите возвраст:");
    String age = scanner.nextLine();

    switch (age){
        case "один", "два", "три" :
            System.out.println("Ты родился");
            break;
        case "семь", "восемь", "девять" :
            System.out.println("Ты пошел в школу");
            break;
        case "восемнадцать", "девятнадцать" :
            System.out.println("Ты закончил школу");
            break;
        default:
            System.out.println("ни одно из предыдущих условий не подошло");
    }
    }
    }