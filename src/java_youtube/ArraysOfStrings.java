package java_youtube;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String [] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "джава";
        for (int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println("------------");
        for (String s:strings){
            System.out.println(s);
        }
        System.out.println("------------");
        int[] numbers = {1,2,3};
        int sum = 0;
        for (int x:numbers) {
            sum = sum+x;
        }
        System.out.println(sum);

    }
}
