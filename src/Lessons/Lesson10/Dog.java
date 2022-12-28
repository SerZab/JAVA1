package Lessons.Lesson10;

public class Dog {
    String name;
    int age;
    String breed;
    boolean hangry;

    public Dog(String name, int age, String breed, boolean hangry) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.hangry = hangry;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", hangry=" + hangry +
                '}';
    }
}
