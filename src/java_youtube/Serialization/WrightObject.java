package java_youtube.Serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WrightObject {
    public static void main(String[] args) {
        Person [] people = {new Person(1,"Bob"), new Person(2, "Mike"),
                new Person(3,"Olga"), new Person(4, "Julia"), new Person(5, "Alona")};
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"));
            oos.writeObject(people);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
