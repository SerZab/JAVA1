package Lessons.Lesson18.homeworkExtra;

public class Task3Test {
    public static void main(String[] args) {
        int arraySize = 12;

    Task3Util task3Util = new Task3Util();

    int[] expectedArray = new int [12];
    int[] realArray = task3Util.createArray(arraySize);

    if(expectedArray.length == realArray.length){
        System.out.println();
    }

    }
}