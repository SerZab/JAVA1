package Lessons.Lesson7;

public class IfElseExample {
    public static void main(String[] args) {
        String stringForCondition = "Berlin";

        if (stringForCondition.equals("Java")){
            System.out.println("Java cool!");
        } else if (stringForCondition.equals("Tel Ran")) {
            System.out.println("Our school!");
        } else if (stringForCondition.equals("Anna")) {
            System.out.println("Our student");
        } else if (stringForCondition.equals("Berlin")) {
            System.out.println("Our city");
        }else {
            System.out.println("I don't understand");
        }
    }
}
