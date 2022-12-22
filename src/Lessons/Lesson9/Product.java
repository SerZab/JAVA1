package Lessons.Lesson9;

public class Product {
    String product;
    double standardPrice;
    double discount;

    public Product(String product) {
        this.product = product;
    }

    public double actualPriceActual(){

        double priceWithDiscount = standardPrice * (1-discount);

        return priceWithDiscount;
    }
    public void printInformation (double priceWithDiscount){
        System.out.println(" Product Name -" + product);
        System.out.println(" Standart Price -" + standardPrice);
        System.out.println("Discount - " + discount);
        System.out.println("Price with discount - " + priceWithDiscount);
    }
}
