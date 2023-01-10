package java_youtube;

public class Lesson20 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",40);
        Human h2 = new Human ("Tom", 34);
        Human h3 = new Human("Dodik", 23);
        h1.toString();
        System.out.println(h1);
    }
}
class Human {
    private String name;
    private int age;
    
    public Human (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + ',' + age;
    }
}