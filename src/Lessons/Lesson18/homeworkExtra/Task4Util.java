package Lessons.Lesson18.homeworkExtra;

public class Task4Util {
    int[] createArray(int arraySize){
        return new int[arraySize];
    }

    int[] fillArray(int[] arrayForFilling, int startValue, int endValue){

        for (int i = 0; i < arrayForFilling.length; i++) {
            arrayForFilling[i] = (int) (Math.random()*(endValue-startValue) + startValue);
        }

        return arrayForFilling;
    }

    void printArray(int[] arrayForPrinting){
        System.out.println();
        System.out.println("Our array:");
        for (int i = 0; i < arrayForPrinting.length; i++) {
            System.out.print(arrayForPrinting[i] +", ");
        }
    }

    int[] changeOddIndexToZero(int[] originalArray){
        int[] changedArray = originalArray.clone();
        for (int i = 0; i < changedArray.length; i++) {
            if (i % 2 != 0) {
                changedArray[i] = 0;
            }
        }
        return changedArray;
    }
}
