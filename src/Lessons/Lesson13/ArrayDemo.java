package Lessons.Lesson13;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayCreate arrayCreate = new ArrayCreate();

        UserInterface userInterface = new UserInterface();

        ArrayUtil arrayUtil = new ArrayUtil();

        int arraySize = userInterface.userArraySizeInput("Please enter Array size");
        int [] ourWorkingArray = arrayCreate.createArray(arraySize);

        arrayCreate.fillArray(ourWorkingArray, true, 500);
        
        System.out.println(Arrays.toString(ourWorkingArray));

        int maxFromArray = arrayUtil.findMaxElement(ourWorkingArray);
        int minFromArray = arrayUtil.findMinElement(ourWorkingArray);
        System.out.println("Min "+minFromArray);
        System.out.println("Max "+maxFromArray);

        int indexForSplit = userInterface.userArraySizeInput("Please enter index for split less than " +(ourWorkingArray.length-1));
        int[] newArrayPart1 = arrayUtil.createNewArray(ourWorkingArray, 0, indexForSplit);
        int[] newArrayPart2 = arrayUtil.createNewArray(ourWorkingArray,indexForSplit+1,ourWorkingArray.length-1);
        System.out.println(Arrays.toString(newArrayPart1));
        System.out.println(Arrays.toString(newArrayPart2));
    }
}