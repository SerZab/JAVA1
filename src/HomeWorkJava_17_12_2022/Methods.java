package HomeWorkJava_17_12_2022;

public class Methods {
    public double addition (double x, double y){   // Прибавление
        return (x+y);
    }
    public double deduction (double x, double y){   // Отнимание
        return (x-y);
    }
    public double multiplication (double x, double y){   // Умножение
        return x*y;
    }
    public double division (double x, double y){   // деление
        return x/y;
    }
    public double Valuta (double x) {   // Курс валют
        return x / 1.06;                  // 1.06 курс доллара
    }
    public int Pizza (int x) {   // Диаметр пиццы > 24
        return (x*x)/4;                  // Площадь пиццы
    }
}
