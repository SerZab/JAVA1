public class Main {
    public static void main(String[] args) {

        // Форматированный вывод, в кавычках указываем тип выводимой переменной  и кол-во символов для этой переменной.
        System.out.println("-----------+------------+------------+------------+------------+------------+------------" +
                "+------------+");

        System.out.printf("%10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s |\n","byte", "short", "int", "long",
                "float", "double", "char", "boolean");
        System.out.println("-----------+------------+------------+------------+------------+------------+------------" +
                "+------------+");
        byte b = 1;
        short s = 2000;
        int i = 1000000000;
        long l = 1000000000l;
        float f = 12.345f;
        double d1 = 25.64775;
        char c = 's';
        boolean bool = true;
        System.out.printf("%10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s |\n", "b", "s", "i", "l", "f", "d1",
                "c", "bool");
        System.out.println("-----------+------------+------------+------------+------------+------------+------------" +
                "+------------+");
        System.out.printf("%10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s |\n", b, s, i, l, f, d1, c, bool);
        System.out.println("-----------+------------+------------+------------+------------+------------+------------" +
                "+------------+");
        int x = 531;
        int y = x / 100;
        int z = x / 10 % 10;
        int q = x % 100 % 10;

        System.out.println("Дано число "+x);
        System.out.println("Первая цифра "+y);
        System.out.println("Вторая цифра "+z);
        System.out.println("Вторая цифра "+q);


    }
}