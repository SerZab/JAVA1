package Lessons.Lesson12;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = {61,97,3,56,453,-2,45,76,890,1,308};
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Minimalnoe = "+min);

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j]>max){
                max = numbers[j];
            }
        }
        System.out.println("Maximalnoe = "+max);
    }
}
