package Lessons.Lesson12;

public class ArrayOperationsExample {
    public int sumArray(int [] workArray){
        int sum=0;
        for (int i = 0; i < workArray.length; i++) {
        sum = sum + workArray[i];
        }
        return sum;
    }
    public int MinArray (int [] workArray){
         int min = 0;
        for (int i = 0; i < workArray.length; i++) {
        if (workArray[i]<min){
            min = workArray[i];}
        }
         return min;
    }
    public int MaxArray (int [] workArray){
        int max = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i] > max){
                max = workArray[i];}
        }
        return max;
    }
} 
