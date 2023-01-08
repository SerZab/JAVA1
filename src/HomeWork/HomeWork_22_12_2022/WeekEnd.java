package HomeWork.HomeWork_22_12_2022;
import java.util.Scanner;

public class WeekEnd {
    public static void main(String[] args) {  //Создайте две переменные isWeekend и isRain. Создайте переменную canWalk,
                                               // значение которой должно быть истинным, если это выходной день
                                               // (isWeekend=true) и не идет дождь (isRain=false).

        boolean isWeekend = Methods.scannerNew1("Is today Weekend (true or false)?");
        boolean isRain = Methods.scannerNew1("Is it rain today (true or false)?");
        
        boolean canWalk = false;
        if (isWeekend && !isRain) {
            canWalk = true;
        }
        System.out.println("Can I walk today? - " + canWalk);
    }
}
