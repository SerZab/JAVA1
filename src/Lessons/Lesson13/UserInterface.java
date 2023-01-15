package Lessons.Lesson13;

import java.util.Scanner;

public class UserInterface {
    public int userArraySizeInput (String text){
        Scanner scanner  = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }
}
