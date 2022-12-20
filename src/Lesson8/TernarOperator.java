package Lesson8;

public class TernarOperator {
    public static void main(String[] args) {

        System.out.println(checkNumber(20.0));
    }
    public static int checkNumber (double number) {
        int checkMainPart = (int) (number);
        double ostatok = number - checkMainPart;
        System.out.println("ostatok =" + ostatok);

        if (ostatok == 0) {
            return checkMainPart * checkMainPart;
        } else {
            return 0;
        }
    }
}
