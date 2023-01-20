package Lessons.Lesson17.lesssonCode;

import java.util.Arrays;

public class TaskUtil {
    public String[] reverseArray(String[] workingArray){
        String[] arrayAfterReverse = new String[workingArray.length];
        
        for (int i = 0; i < workingArray.length; i++) {
        arrayAfterReverse[arrayAfterReverse.length-1-i] = workingArray[i];
        }
        return arrayAfterReverse;
    }
    public void reverseArray1 (String[] workingArray) {
        String temp = "";
        int a = workingArray.length;

        for (int i = 0; i < a/2; i++) {
            temp = workingArray[i];
            workingArray[i] = workingArray[a-1-i];
            workingArray[a-1-i] = temp;
            System.out.println(Arrays.toString(workingArray));
        }
        System.out.println("Final result:");
        System.out.println(Arrays.toString(workingArray));
    }

    public void printArr(String[] workingArray, String text){
        System.out.println(text);
        System.out.println(Arrays.toString(workingArray));
    }
}
