package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Holodilnik {
    private HashMap<String, Integer> produkts = new HashMap<>();
    private ArrayList<String> strings2 = new ArrayList<>();


    public void putProduct(String product, int value) {
        if (produkts.containsKey(product)) {
            int currentValue = produkts.get(product);
            produkts.put(product, value + currentValue);
        } else {
            produkts.put(product, value);
        }
    }

    public void getProdukt(String product, int value) {
        if (produkts.containsKey(product)) {
            if (value > produkts.get(product)) {
                System.out.println("В холодильнике нет столько " + product);
            } else {
                int currentValue = produkts.get(product);
                produkts.put(product, currentValue - value);
            }
        } else {
            System.out.println("Такого продукта нет");
        }
    }


    public void printAllNetto() {
        int netto = 0;
        for (String key : produkts.keySet()) {
            netto += produkts.get(key);
        }
        System.out.println(netto);
    }


    public void printAllProducts() {
        for (String key : produkts.keySet()) {
            System.out.println(key + " - " + produkts.get(key) + " кг");
        }
    }

    public void getProductsInOrder() {
        for (String key : produkts.keySet()) {
            strings2.add(key);
            Collections.sort(strings2);
        }
        System.out.println("Список продуктов в холодильнике в алфавитном порядке: " + strings2);
    }

    public void productWithMaxAmount() {
        System.out.println("Продукт в холодильнике с максимальным количеством: " + Collections.max(produkts.keySet()));
    }

    public void productWithMinAmount() {
        System.out.println("Продукт в холодильнике с минимальным количеством: " + Collections.min(produkts.keySet()));
    }

    public void getMinSet(int n){
//        for (String key : produkts.keySet()) {
//            if(produkts.keySet() < n){
//
//            }
//            System.out.println(key + " - " + produkts.get(key) + " кг");
        }
    }



