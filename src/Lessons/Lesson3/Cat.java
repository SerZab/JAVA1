package Lessons.Lesson3;

public class Cat {
    String name;
    String breed;
    int age;
    double weight;
    static int id;
    int ident;

    public Cat(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        ident = id; // Автоматически генерируются код
        id++;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", ident=" + ident +
                '}';
    }
}
