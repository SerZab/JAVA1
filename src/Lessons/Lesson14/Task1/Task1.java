package Lessons.Lesson14.Task1;

public class Task1 {
    public static void main(String[] args) {
        Methods methods = new Methods();

        int fromNumber = methods.inputData("from");
        int toNumber = methods.inputData("to");

        int arraySize = methods.detectArraySize(fromNumber,toNumber);

        int [] workingArray = methods.crateArray (arraySize);

        methods.fillArray(workingArray,fromNumber,toNumber);
        
        methods.printArray(workingArray);
        
    }
}
