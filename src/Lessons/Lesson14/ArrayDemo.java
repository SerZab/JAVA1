package Lessons.Lesson14;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

            int [] array = new int[] {1,3,4,5,6,78,32,-1};
        System.out.println(Arrays.toString(array));
            BubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void BubbleSort(int[] arrNotSorted){
        int counter = 0;
        for (int i = 0; i < arrNotSorted.length - 1; i++) {
            if (arrNotSorted[i]>arrNotSorted[i+1]){
                int buffer = arrNotSorted[i];
                arrNotSorted[i]=arrNotSorted[i+1];
                arrNotSorted[i+1] = buffer;
                counter++;
            }
        if (counter>0)  {
            BubbleSort(arrNotSorted);

        }
        }

    }
}
