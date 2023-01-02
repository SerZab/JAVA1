package java_youtube;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int [] numbers = new int[10];
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = i * 25;
            System.out.println(numbers[i]);
        }
            int [] numbers1 = {1,3,5,7};
            for (int i = 0; i<numbers1.length; i++){
                System.out.println(numbers1[i]);
            }
    }
}