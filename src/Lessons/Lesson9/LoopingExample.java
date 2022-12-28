package Lessons.Lesson9;

import java.util.Scanner;

public class LoopingExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = -1;
        int y = -1;
        boolean condition = true;

        while (condition) {
            System.out.println("Enter X number");
            x = scanner.nextInt();

            System.out.println("Enter Y number");
            y = scanner.nextInt();

            System.out.println("Add result - " + (x + y));
            if (x==100) { condition = false;}

        }

        //for (int i = 0; i < 40; i=i+2){
        //    System.out.println("i = " + i + ";  ");}
    }
}
