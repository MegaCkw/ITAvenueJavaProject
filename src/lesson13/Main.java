package lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(new Coin("Золото", 1000, 5, 2.5));
        coins.add(new Coin("Золото", 1600, 10, 2.5));
        coins.add(new Coin("Серебро", 1500, 2, 2));
        coins.add(new Coin("Бронза", 1000, 1, 3));
        coins.add(new Coin("Золото", 1000, 1, 2.5));

        for (Coin coin: coins){
            System.out.println(coin);
        }

    }
}
