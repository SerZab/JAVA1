package Lessons.Lesson14.Task1;

public class Methods {
    public int inputData(String text){
        if (text.equals("from")){
            return 1;
        }
        if (text.equals("to")){
            return 99;
        }
        return 0;
    }
    public int detectArraySize(int fromNumber, int toNumber){
        int arraySize = (toNumber-fromNumber)/2+1;
        return arraySize;
    }
    public int[] crateArray(int size){
        return new int[size];
    }
    public void fillArray (int[] arrayForFilling, int fromNumber, int toNumber){
        int counter = 0;
        for (int i = fromNumber; i <= toNumber; i++) {
            if (i%2 !=0){
                arrayForFilling[counter] = i;
                counter++;
            }
        }
    }
    public void printArray(int[] arrayFilling){
        for (int i = arrayFilling.length-1; i >= 0; i--) {
            System.out.print(arrayFilling[i]+" ");
        }
    }
}
