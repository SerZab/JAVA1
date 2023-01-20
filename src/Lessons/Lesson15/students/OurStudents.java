package Lessons.Lesson15.students;

import java.util.Arrays;

public class OurStudents {
    public static void main(String[] args) {
        Person[] listOfPerson = new Person[5];
        listOfPerson[0] = new Person(1,"Petr",19);
        listOfPerson[1] = new Person(2,"Anna",18);
        listOfPerson[2] = new Person(3,"Viktor",21);
        listOfPerson[3] = new Person(4,"Ruslan",20);
        listOfPerson[4] = new Person(5,"Pavel",22);

        Students[] listOfStudents = new Students[4];
        listOfStudents[0] = new Students(1, listOfPerson[0],"Group1");
        listOfStudents[1] = new Students(2, listOfPerson[1],"Group1");
        listOfStudents[2] = new Students(3, listOfPerson[3],"Group1");
        listOfStudents[3] = new Students(4, listOfPerson[4],"Group1");


        for (int i = 0; i < listOfPerson.length; i++) {
            System.out.println("Name Person - " +listOfPerson[i].name+" Age - "+listOfPerson[i].age);
        }
        System.out.println(Arrays.toString(listOfPerson));
        System.out.println("------------------");
        for (int i = 0; i < listOfStudents.length; i++) {
            System.out.println("Student's Name - "+listOfStudents[i].student.name+", group - "+listOfStudents[i].group);
        }

        listOfPerson[4].name = "Sergey";
        System.out.println("------------------");
        for (int i = 0; i < listOfStudents.length; i++) {
            System.out.println("Student's Name - " + listOfStudents[i].student.name + ", group - " + listOfStudents[i].group);
        }
        for (Students tempStudent: listOfStudents) {
            System.out.println(tempStudent.student.name+","+tempStudent.group);
        }
        for (Person i: listOfPerson) {
            System.out.println("Name of person - "+i.name+", age of student - "+i.age+", id of person - "+i.id+".");
        }
    }
}
