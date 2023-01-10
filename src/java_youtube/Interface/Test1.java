package java_youtube.Interface;

public class Test1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outPutInfo(animal1);
        outPutInfo(person1);
    }
    public static void outPutInfo(Info info){
        info.showInfo();
    }
}
