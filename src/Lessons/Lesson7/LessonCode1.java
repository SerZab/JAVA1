package Lessons.Lesson7;

import java.util.Scanner;

public class LessonCode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your figure -");
        int userInput1 = scanner.nextInt();

        if (userInput1<0){
            System.out.println("Your figure is negative!");
        } else if (userInput1>0) {
            System.out.println("Your figure is positive!");
        } else if (userInput1==0) {
            System.out.println("Your figure is O");
        }else {
            System.out.println("How is it possible");
        }
    }
}
