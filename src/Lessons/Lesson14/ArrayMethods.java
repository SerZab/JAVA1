package Lessons.Lesson14;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int [] workArray = new int[3];
        workArray[0] = 1;
        workArray[1] = 2;
        workArray[2] = 3;

        System.out.println(Arrays.toString(workArray));

        int [] cloneArray = workArray.clone();

        workArray[1] = 5;
        System.out.println(Arrays.toString(cloneArray));
        System.out.println(Arrays.toString(workArray));

        System.out.println("----------------");

        String [] stringArray = new String[3];
        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";

        System.out.println(Arrays.toString(stringArray));

        String [] stringArrayClone = stringArray.clone();

        stringArray[2] = "5";

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(stringArrayClone));

        String[] newArray;
        newArray = Arrays.copyOf(stringArrayClone,10);
        System.out.println(Arrays.toString(newArray));

    }
}
