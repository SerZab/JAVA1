package Lessons.Lesson13;

public class ArrayUtil {
    public int findMaxElement (int[] workingArray){
        int max = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > max){max = workingArray[i];}
        }return max;
    }
    public int findMinElement (int[] workingArray){
        int min = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] < min){min = workingArray[i];}
        }return min;
    }
    public int[] createNewArray(int[] workingArray, int indexStart, int indexEnd){
        int[] newArray = new int[indexEnd-indexStart+1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = workingArray[indexStart+i];
        }return newArray;
    }
}
