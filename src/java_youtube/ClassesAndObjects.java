package java_youtube;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-2);
        System.out.println("Выводим значение в Main методе: " + person1.getName());
        System.out.println("Выводим значение в Main методе: " + person1.getAge());
        Person person2 = new Person();
        person2.setName("Василий");
        person2.setAge(35);
        
        
    }
}
class Person {
    private String name;
    private int age;

    public void setName (String username){
        if (username.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        }else { name = username;}
    }
    public String getName() {
        return name;
    }
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Возраст должен быть положительый");
        }else { age = userAge;}
    }
    public int getAge() {
        return age;
    }

    int calculateYearsToRetired(){
        int years = 65-age;
        return years;
    }
    void speak(){
        System.out.println("меня зовут " + name + ", мне " + age + " лет.");
    }
    void sayHello(){
        for (int i = 0; i<5; i++){
        System.out.println("Пивет!!!");
        }
    }
}