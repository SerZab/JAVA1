package HomeWork;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array1 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(array1));

        int[] array2 = Arrays.copyOfRange(array1, 0, 2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = Arrays.copyOfRange(array1, 3, 5);
        System.out.println(Arrays.toString(array3));

        int [] array4 = new int [array2.length + array3.length];

        int f = 0;

        for (int i = 0; i < array2.length; i++) {
            array4[f] = array2[i];
            f += 1;
        }

        for (int i = 0; i < array3.length; i++) {
            array4[f] = array3[i];
            f += 1;
        }

        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i]+" ");
        }
    }
}
