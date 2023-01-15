package java_youtube.Lesson29;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }
    public void eat(){
        System.out.println("I'm eating");
    }
    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal id = " + id;
    }
}
