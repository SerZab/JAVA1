package HomeWorkJava_17_12_2022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое слово"); // Первое слово
        String word1 = scanner.next();
        System.out.println("Введите другое слово"); // Второе слово
        String word2 = scanner.next();

        System.out.println("Количество символов в 1 слове " +word1.length()); // Выводим количество символов 1 слова
        System.out.println("Количество символов во 2 слове " +word2.length()); //Выводим количество символов 2 слова

        String word3 = (word1.substring(0, word1.length()/2)) +    //  1 часть первого слова и 2 часть второго слова
            (word2.substring(word2.length()/2, word2.length()));
        System.out.println(word3);

        String word4 = (word2.substring(0, word2.length()/2)) +    // 1 часть второго слова и 2 часть первого слова
                (word1.substring(word1.length()/2, word1.length()));
        System.out.println(word4);
    }
}
