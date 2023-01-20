package HomeWork.HomeWork_19_01_2023;

import java.util.Arrays;

public class Task1 {
    /*
    Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N.
    Каждое число представлено в одном экземпляре, кроме одного числа.
    Найдите недостающий элемент.

    Мы знаем, что сумма чисел можно вычислить по формуле 1 + 2 + … + n = n×(n+1)/2.
    Мы можем использовать эту формулу, чтобы найти пропущенное число, если от суммы целого ряда
    отнять сумму чисел с пропущеной цифрой. Например сумма чисел от 1 до 10 = 55.
    Если в нашем массиве отсутствует 6, сумма этих чисел = 49. Разница сумм = 6...
     */
    public static void main(String[] args) {
        int[] newArray = {1,8,6,2,4,10,5,7,3,11,12};
        System.out.println(Arrays.toString(newArray));

        Methods methods = new Methods();
        int n = methods.Elements(newArray);
        System.out.println("Количество элементов массива - "+n+".");

        int c = methods.missingElement(newArray,n);
        System.out.println("Недостающий элемент - "+c);
    }

}
