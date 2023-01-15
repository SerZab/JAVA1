package Lessons.Lesson13;

import java.util.Scanner;

public class ArrayCreate {
    public int [] createArray (int arraySize){
        int [] createArray = new int [arraySize];
        return createArray;
    }
    public void fillArray(int [] workingArray, boolean createArrayRandom, int randomRange){
        if (createArrayRandom){
            fillArrayByRandom(workingArray, randomRange);
        }else {
            fillArrayByUserInput(workingArray);
        }
    }
    public void fillArrayByRandom (int [] workingArray, int randomRange){
        for (int i = 0; i < workingArray.length; i++) {
          workingArray[i] = (int) (Math.random()*randomRange);
        }
    }
    public void fillArrayByUserInput (int [] workingArray){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill Array");
        for (int i = 0; i < workingArray.length; i++) {
            System.out.println("Please enter " +i+ " element of Array");
            workingArray [i] = scanner.nextInt();
        }
    }
}

