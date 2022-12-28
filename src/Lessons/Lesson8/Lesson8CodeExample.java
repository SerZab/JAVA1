package Lessons.Lesson8;

public class Lesson8CodeExample {
    /*
    Написать программу, которая запрашивает у пользователя
    три целых числа и выводит на консоль наибольшее из них.
    PS: перед решением этой задачи распишите на бумаге
    или в коментарии все возможные варианты (комбинации).

    Это поможет вам правильно написать программу!
    Нельзя пользоваться классом Math.
     */
    public static void main(String[] args) {

      ThreeNumberCompare threeNumberCompare = new ThreeNumberCompare();
        double parametr1 = threeNumberCompare.userNumberInput("Please enter your first Number: ");
        double parametr2 =threeNumberCompare.userNumberInput("Please enter your second Number: ");
        double parametr3 =threeNumberCompare.userNumberInput("Please enter your third Number: ");

        double chechResult = threeNumberCompare.compare(parametr1,parametr2,parametr3);

        threeNumberCompare.printMsg("Maximal from your three numbers is "+chechResult);
    }
}
