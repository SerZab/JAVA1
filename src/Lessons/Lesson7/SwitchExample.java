package Lessons.Lesson7;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input smth...");
        String userInput = scanner.nextLine();

        switch (userInput){
            case "add":
                System.out.println("You want to add smth...");
                break;
            case "delete":
                System.out.println("You want to delete smth...");
                break;
            case "replace":
                System.out.println("You want to replace smth...");
                break;
            default:
                System.out.println("What do you want");
        }
    }
}
