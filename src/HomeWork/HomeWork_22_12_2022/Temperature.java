package HomeWork.HomeWork_22_12_2022;
public class Temperature {
    public static void main(String[] args) {    //Представим, что у нас есть устройство, в котором две колбы.
                                                // Прибор работает корректно, если температура первой колбы выше 100
                                                // градусов, а температура второй колбы меньше 100 градусов.


        int Temp1 = Methods.scannerNew("Введите температуру первой колбы (>100) : ");
        int Temp2 = Methods.scannerNew("Введите температуру второй колбы (<100) : ");


        if (Temp1 >= 100 && Temp2 <= 100) {
            System.out.println("Прибор работает корректно");
        }
        else {
            System.out.println("Прибор работает НЕ корректно");
        }

    }
}
