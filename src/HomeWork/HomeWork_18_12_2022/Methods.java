package HomeWork.HomeWork_18_12_2022;

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
    public double Pizza (double diametr) {   // Диаметр пиццы > 24
        return (diametr*diametr)/4 * Math.PI;                  // Площадь пиццы
    }
}
