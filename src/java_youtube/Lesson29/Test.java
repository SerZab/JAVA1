package java_youtube.Lesson29;

import java.util.*;
class Animal1 {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        animal1.eat();
        Animal1 animal2 = new Animal1(){
            public void eat(){
                System.out.println("I'm eating");
            }
        };
        animal2.eat();

    }
}
