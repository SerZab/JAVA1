package Lessons.Lesson5;

public class WorkWithString2 {
    public static void main(String[] args) {
        String text = " Это текст для методов проверки методов работы методов типа String!   ";
        StringMethodtext(text);
        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.trim());
        System.out.println(text.indexOf("методов"));
        System.out.println(text.lastIndexOf("методов"));

        String str1 = "Java. ";
        String str2 = "Java.";
        String str3 = new String("Java. ");
        String str4 = "Java";

        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1 == str3);

            Integer number = 1000;

            // Бинарный формат числа
            String convert = Integer.toBinaryString(number);
            System.out.println(convert);

            // Восьмиричная форма
            convert = Integer.toOctalString(number);
            System.out.println(convert);

            // Шеснадцатиричная форма
            convert = Integer.toHexString(number);
            System.out.println(convert);


    }

    public static void StringMethodtext(String text) {
        String testString1 = "для";
        boolean resultContains = text.contains(testString1);
        System.out.println(resultContains);
    }
}
