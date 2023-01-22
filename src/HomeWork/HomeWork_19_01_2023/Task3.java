package HomeWork.HomeWork_19_01_2023;

public class Task3 {
    /*
    Дано два числа, например 3 и 56, значение которых хранятся в переменных.
    a)Необходимо составить следующие текстовые строки:
    3 + 56 = 59
    3 – 56 = -53
    3 * 56 = 168.
    Используйте метод StringBuilder.append().
    b) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
    c) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
     */
    public static void main(String[] args) {

        Methods methods = new Methods();

        int a = methods.scannerNew("Введите число А от 1 до 9");
        int b = methods.scannerNew("Введите число Б от 10 до 99");

        StringBuilder text = new StringBuilder();
        text.append(a);
        text.append(" + ");
        text.append(b);
        text.append(" = ");
        text.append(a + b);
        System.out.println(text); // 3 + 56 = 59

        StringBuilder text1 = new StringBuilder();
        text1.append(a);
        text1.append(" - ");
        text1.append(b);
        text1.append(" = ");
        text1.append(a - b);
        System.out.println(text1); // 3 - 56 = 59

        StringBuilder text2 = new StringBuilder();
        text2.append(a);
        text2.append(" * ");
        text2.append(b);
        text2.append(" = ");
        text2.append(a * b);
        System.out.println(text2); // 3 * 56 = 168

        // Исправил ошибку, написал метод поиска и замены
        // Атакже применил метод сканнера с проверкой ввода нужных, по заданиу данных

        String str = methods.scannerCheck("Введите символ '=', который необходимо заменить на строку");
        String str1 = methods.scannerCheck("Введите строку 'равно'");
        char s = str.charAt(0);

        System.out.println(methods.findUndReplaceCharToString(text,s,str1));
        System.out.println(methods.findUndReplaceCharToString(text1,s,str1));
        System.out.println(methods.findUndReplaceCharToString(text2,s,str1));
        
        /*
        text.deleteCharAt(7);
        text.insert(7,"равно");
        System.out.println(text);

        text1.replace(7, 8,"равно");
        System.out.println(text1);

        text2.replace(7, 8,"равно");
        System.out.println(text2);
         */
    }
}