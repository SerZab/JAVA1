package java_youtube.Serialization;

public class Rekursia {
    public static void main(String[] args) {
        System.out.println(fac(16));
    }
    private static int fac (int n){
    if (n == 1)
        return 1;
    return n * fac(n - 1);
    
    }
}
