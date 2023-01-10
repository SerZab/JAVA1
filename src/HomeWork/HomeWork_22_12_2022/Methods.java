package HomeWork.HomeWork_22_12_2022;
import java.util.Scanner;
public class Methods {

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
    public static String scannerText (String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextLine();
    }
    public static int numberOfLifts () {
        int buildingSize = scannerNew("Введите высоту здания");
        int stepUp = scannerNew("На какую высоту поднимается лифт");
        int stepDown = scannerNew("На сколько этажей опускается лифт");

        int currentFloor = 0;
        int dayCounter = 0;

        while (currentFloor < buildingSize) {
            dayCounter++;
            currentFloor = currentFloor + stepUp;
            if (currentFloor >= buildingSize) {
                break;}
            currentFloor = currentFloor - stepDown;
        }
        return dayCounter; // выводим количество дней
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
