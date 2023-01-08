package java_youtube;

public class Lesson19 {
    public static void main(String[] args) {

    }
    class Human {
        String name;
        int age;
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        public void getInfo(){
            System.out.println(name+" "+age);
        }
    }
}
