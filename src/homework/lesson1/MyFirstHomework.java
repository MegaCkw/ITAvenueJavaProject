package homework.lesson1;

public class MyFirstHomework {

    public static void main(String[] args) {

        double myMoney = 1000;
        double pricePizza = 230;
        double priceGum = 26;
        double priceCandy = 2.5;

        int countPizza = (int) (myMoney / pricePizza);
        System.out.println("На эти деньги мы можем купить:");
        System.out.println(countPizza);
        System.out.println("пиццы,");

        double countChangeAfterPizza = myMoney - pricePizza * countPizza;
        int countGum = (int) (countChangeAfterPizza / priceGum);
        System.out.println(countGum);
        System.out.println("жвачки,");

        double countChangeAfterGum = countChangeAfterPizza - priceGum * countGum;
        int countCandy = (int) (countChangeAfterGum / priceCandy);
        System.out.println(countCandy);
        System.out.println("конфет.");

        double countChangeAfterCandy = countChangeAfterGum - priceCandy * countCandy;
        System.out.println("Сдача с магазина:");
        System.out.println(countChangeAfterCandy);
        System.out.println("рубля.");

    }
}
