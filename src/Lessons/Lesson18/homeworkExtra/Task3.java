package Lessons.Lesson18.homeworkExtra;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Task3Util task3Util = new Task3Util();
        int arraySize = 25;
        int startValue = -100;
        int endArray = 100;
        
        int[] workingArray = task3Util.fillArray(task3Util.createArray(arraySize),startValue,endArray);

        int maxElement = task3Util.findMaxElement(workingArray);
        int minElement = task3Util.findMinElement(workingArray);
        int lastIndex = task3Util.findLastIndexElement(workingArray,maxElement);

        System.out.println(Arrays.toString(workingArray));
        System.out.println("Our Max element is - "+maxElement);
        System.out.println("Our Min element is - "+minElement);
        System.out.println("Last index is - "+lastIndex);
    }
}
