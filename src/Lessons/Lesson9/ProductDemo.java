package Lessons.Lesson9;

public class ProductDemo {
    public static void main(String[] args) {

        Product productMilk = new Product("Milk");
        productMilk.standardPrice = 1.5;
        productMilk.discount = 0.1;

        productMilk.printInformation(productMilk.actualPriceActual());

        Product productBread = new Product("Bread");
        productBread.standardPrice = 1.2;
        productBread.discount = 0.15;

        productBread.printInformation(productBread.actualPriceActual());

    }
}
