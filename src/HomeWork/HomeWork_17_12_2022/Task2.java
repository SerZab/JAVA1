package HomeWork.HomeWork_17_12_2022;

public class Task2 {
    public static void main(String[] args) {

        String str = "I study Basic Java!"; // 1 Создайте строку через new - I study Basic Java!
                                                // 2 Я не понимаю это - Напишите метод, который принимает в качестве
                                                // параметра строку, передайте в этот метод строку, которую создали в п.1
        System.out.println("Количество символов " +str.length()); // Узнать количество символов
        char result = str.charAt(18);   // Символов 19(0-18)
        System.out.println(result);     // 3 Распечатать последний символ строки. Используем метод String.charAt()
        System.out.println(str.contains("Java"));   // 4 Проверить, строку “Java”. Используем метод String.contains()

        String newString = str.replace('a','i'); // 5 Заменить все символы “а” на “о”.
        System.out.println(newString);

        String newString1 = str.toUpperCase(); // 6 Преобразуйте строку к верхнему регистру.
        System.out.println(newString1);

        String newString2 = str.toLowerCase(); // 7 Преобразуйте строку к нижнему регистру.
        System.out.println(newString2);

        String newString3 = str.substring(14,18); // 8 Вырезать строку Java c помощью метода String.substring().
        System.out.println(newString3);
    }
}
