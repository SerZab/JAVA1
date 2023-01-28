package Lessons.Lesson18;

import HomeWork.HomeWork_19_01_2023.Methods;

public class Task1 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[] newArray = {1,8,6,2,4,10,5,7,3,11,12};
        int n = methods.Elements(newArray);

        int expectResult = 9;
        int result = methods.missingElement(newArray,n);

        
    }
}
