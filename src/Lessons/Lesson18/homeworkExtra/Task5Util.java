package Lessons.Lesson18.homeworkExtra;

public class Task5Util {
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
        System.out.println();
    }

    double averageValueCalculate(int[] workingArray){
        int summValue=0;
        for (int i = 0; i < workingArray.length; i++) {
            summValue = summValue + workingArray[i];
        }
        double averageValue = summValue / (double) workingArray.length;
        return averageValue;
    }

    void printAverageInfo(double averageValue1, double averageValue2){
        System.out.println();
        if (averageValue1 > averageValue2) {
            System.out.println("Average value first array > Average value second array ");
        } else if (averageValue1 <  averageValue2) {
            System.out.println("Average value first array < Average value second array ");
        } else {
            System.out.println("Averages values of our arrays are equal");
        }
    }
}
