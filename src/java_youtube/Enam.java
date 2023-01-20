package java_youtube;

public class Enam {
    public static int max(int a, int b, int c)
    {
        if (a > b && a > c)
            return a;
        else if (b > c && b > a)
            return b;
        else return c;
    }

    public static void main(String[] args) {
        String text = "Максималное ";
        System.out.println( text+max(10,20, 30) );
        System.out.println( text+max(-10,-20, -30) );
        System.out.println( text+max(-100,0, -10) );
    }
}   
