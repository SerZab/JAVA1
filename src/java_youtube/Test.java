package java_youtube;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("Dogs");
        animals.add("Cats");
        animals.add("frog");
        String animal = (String) animals.get(0);
        System.out.println(animals.get(2)+animal);

        System.out.println("Dinamics array");
        List<String> animals2 = new ArrayList<>();
        animals2.add("Dog");
        animals2.add("Cat");
        animals2.add("frog");
        System.out.println(animals2.get(0));
    }
}
