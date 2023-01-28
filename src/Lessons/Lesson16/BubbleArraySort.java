package Lessons.Lesson16;

import java.util.Arrays;

public class BubbleArraySort {
    public static void main(String[] args) {

        int[] arrayForSort = {11,8,3,5,2,1,4,7,6,9,10};

        System.out.println("Array before sort:");
        System.out.println(Arrays.toString(arrayForSort));
        bubbleSort(arrayForSort);
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(arrayForSort));
    }

    public static void bubbleSort(int[] workingArray){
        boolean notSorted = false;

        while (!notSorted){
            notSorted = true;
            for (int i = 0; i < workingArray.length-1; i++) {
                if (workingArray[i] > workingArray[i+1]) {
                    int temp = 0;
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i+1];
                    workingArray[i+1] = temp;
                    notSorted = false;
                }
            }
        }
//        while (notSorted) {
//            System.out.println(notSorted);
//            System.out.println(Arrays.toString(workingArray));
//            notSorted = false;
//            for (int i = 0; i < workingArray.length-1; i++) {
//                if(workingArray[i]>workingArray[i+1]){
//                    temp = workingArray[i];
//                    workingArray[i] = workingArray[i+1];
//                    workingArray[i+1] = temp;
//                    notSorted = true;
//                }
//            }
//        }
    }
}
