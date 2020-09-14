package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.putProduct("Яблоко", 2);
        holodilnik.putProduct("Груша", 1);
        holodilnik.putProduct("Слива", 3);
        holodilnik.putProduct("Яблоко", 4);

        holodilnik.getProdukt("Яблоко", 1);
        holodilnik.printAllNetto();
        holodilnik.printAllProducts();
        holodilnik.printAllNetto();


        holodilnik.getProductsInOrder();
        holodilnik.productWithMaxAmount();
        holodilnik.productWithMinAmount();



    }
}
