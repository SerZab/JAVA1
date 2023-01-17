package Lessons.Lesson14;

public class CreateNewClass {
    String name;
    String town;
    int age;
    String education;

    public CreateNewClass(String name, String town, int age, String education) {
        this.name = name;
        this.town = town;
        this.age = age;
        this.education = education;
    }

    public CreateNewClass(String name, String town) {
        this.name = name;
        this.town = town;
    }

    public CreateNewClass(String town, int age) {
        this.town = town;
        this.age = age;
    }

    
}
