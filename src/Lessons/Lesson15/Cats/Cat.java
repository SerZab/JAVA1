package Lessons.Lesson15.Cats;

public class Cat {
    int idCat;
    String name;
    Breed breedName;

    public Cat(int idCat, String name, Breed breedName) {
        this.idCat = idCat;
        this.name = name;
        this.breedName = breedName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "idCat=" + idCat +
                ", name='" + name + '\'' +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
