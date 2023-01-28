package Lessons.Lesson18.homeworkExtra;

public class Task3Util {
    int[] createArray(int arraySize){
        return new int[arraySize];
    }
    int[] fillArray(int[] arrayForFilling, int startValue, int endValue){
        for (int i = 0; i < arrayForFilling.length; i++) {
         arrayForFilling[i] = (int)(Math.random()*(endValue-startValue) +startValue);
        }
        return arrayForFilling;
    }
    int findMaxElement (int[] workingArray){
        int maxElement = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
        if (maxElement<workingArray[i]){
            maxElement = workingArray[i];
            }
        }
        return maxElement;
    }
    int findLastIndexElement (int[] workingArray, int maxElement){
        int searchIndex = 0;
        
        for (int i = workingArray.length-1; i >= 0; i--) {
            if(workingArray[i] == maxElement){
                searchIndex = i;
                break;
            }
        }
        return searchIndex;
    }
    int findMinElement (int[] workingArray){
        int minElement = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if (minElement>workingArray[i]){
                minElement = workingArray[i];
            }
        }
        return minElement;
    }
}
