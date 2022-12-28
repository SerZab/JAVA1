package HomeWork.HomeWork_17_12_2022;

public class Task1 {
    public static void main(String[] args) {

        String str = "333";   // Task 1.0. Перевести число 333 из шестнадцатиричной в десятичную
        int convert = Integer.parseInt(str, 16);   // Указываем в какой системе radix
        System.out.println("Число в десятичной = "+convert);   // Получаем результат и проверяем в Converter

        int str1 = 637;   // Task 1.2. Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        System.out.println("Шестнадцатиричная система - " + Integer.toHexString(str1));

        String str2 = "27d";   // Task 1.2. и 16->10)
        int convert1 = Integer.parseInt(str2, 16);   // Указываем в какой системе radix
        System.out.println("Число в десятичной = "+convert1);   // Получаем результат и проверяем в Converter

        int str3 = 637;   // Task 1.3. Перевести 637 из десятичной в двоичную
        System.out.println("Двоичная система - " + Integer.toBinaryString(str3)); //первод в двочиную систему

        String str4 = "11100111";   // Task 1.4. 11100111 перевести в десятичную
        int convert2 = Integer.parseInt(str4, 2);   // Указываем в какой системе radix
        System.out.println("Число в десятичной = "+convert2);   // Получаем результат и проверяем в Converter

        int str5 = 637;   // Task 1.5. Перевести 637 из десятичной в троичную
        System.out.println("Троичную система - " +Integer.toString (str5, 3));    //в 3-ичню

    }

}
