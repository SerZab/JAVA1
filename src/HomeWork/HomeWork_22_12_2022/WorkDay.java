package HomeWork.HomeWork_22_12_2022;
import java.util.Random;
public class WorkDay {
    public static void main(String[] args) {    //Есть устройство, на табло которого показывается количество секунд,
                                                // оставшихся до конца рабочего дня. Когда рабочий день начинается
                                                // ровно в 9 часов утра — табло отображает «28800»

        int n = (int) (Math.random() * 28800);

        System.out.println("До конца рабочего дня осталось "+ n + " секунд.");

        int hour = n / 3600;

        System.out.println("(Для сотрудников) до конца работы осталось "+ hour + " часов " + ((n % 3600)/60) + " минут.");

       /*
       if (time > 25200 && time < 28800) { // or Switch + cases
            System.out.println(time);
            System.out.println("Осталось 8 часов");
        }
        if (time > 21600 && time < 25200) {
            System.out.println(time);
            System.out.println("Осталось 7 часов");
        }
        if (time > 18000 && time < 21600) {
            System.out.println(time);
            System.out.println("Осталось 6 часов");
        }
        if (time > 14400 && time < 18000) {
            System.out.println(time);
            System.out.println("Осталось 5 часов");
        }
        if (time > 10800 && time < 14400) {
            System.out.println(time);
            System.out.println("Осталось 4 часа");
        }
        if (time > 7200 && time < 10800) {
            System.out.println(time);
            System.out.println("Осталось 3 часа");
        }
        if (time > 3600 && time < 7200) {
            System.out.println(time);
            System.out.println("Осталось 2 часа");
        }
        if (time > 0 && time < 3600) {
            System.out.println(time);
            System.out.println("Осталось менее часа");
        }
        */
    }
}
