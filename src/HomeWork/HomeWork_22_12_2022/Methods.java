package HomeWork.HomeWork_22_12_2022;
import java.util.Scanner;
class Methods {

    public static int scannerNew (String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }
    public static boolean scannerNew1 (String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextBoolean();
    }
    static int numberOfLifts () {
        int floor = Methods.scannerNew("Введите высоту здания");
        int stepUp = Methods.scannerNew("На какую высоту поднимается лифт");
        int stepDown = Methods.scannerNew("На сколько этажей опускается лифт");

        int lift = 0;
        int number = 0;
        while (lift < floor) {
            lift = lift+stepUp-stepDown;
            number++;
        }
        return number;
    }
    static int operationsNumber (int amount) {
        int days = 0;
        int divider;

        while (amount > 1) {
            divider = amount-1;
            while (amount % divider != 0) {divider--;}
            days++;
            amount = amount - divider;
        }
        return days+1;
    }
}
