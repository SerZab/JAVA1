package TelRan;

public class Variables {
    public static void main(String[] args) {
        // Переменные
        int x = 25;
        int y;
        int z;
        y = 20;
        z = x + y;
        /*
        Comments 1
        Comments 2
         */

        double pi = 3.14151;
        double result = pi * x;

        // Переменная может быть только true and false
        boolean check;
        check = (x == y);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 || b2);
        System.out.println(!b1);

        System.out.println("X равно " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
        System.out.println("Результат =" + result);
        System.out.println("Результат  " + check);

        double a = 10.0;
        int b = 4;
        double res = a / b;
        System.out.println(res);
    }
}
