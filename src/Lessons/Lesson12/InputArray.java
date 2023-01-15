package Lessons.Lesson12;

import java.util.Scanner;

public class InputArray {
    public int [] userInput (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Array size");
        int size = scanner.nextInt();

        int [] createArray = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter " +i+ " element of Array");
            createArray[i] = scanner.nextInt();
        }
        return createArray;
    }

}
