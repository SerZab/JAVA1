package java_youtube;


import HomeWork.HomeWork_22_12_2022.Methods;
import java_youtube.Packet1.Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Лифт превысил колличество этажей на " + Methods.numberOfLifts() + " подъеме");
    }
}
