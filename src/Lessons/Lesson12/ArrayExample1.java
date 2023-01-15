package Lessons.Lesson12;

public class ArrayExample1 {
    public static void main(String[] args) {

        ArrayOperationsExample arrayOperationsExample = new ArrayOperationsExample();

        InputArray inputArray = new InputArray();
        PrintArrayInfo printArrayInfo = new PrintArrayInfo();

        int [] workArray = inputArray.userInput();
        int sum = arrayOperationsExample.sumArray(workArray);
        int min = arrayOperationsExample.MinArray(workArray);
        int max = arrayOperationsExample.MaxArray(workArray);

        printArrayInfo.ArrayPrint("Our Array ", workArray);
        System.out.println("Sum of Array elements is " +sum);
        System.out.println("Minimal of Array =" + min);
        System.out.println("Maximal of Array =" + max);
    }
}
