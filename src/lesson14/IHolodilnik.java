package lesson14;

import java.util.ArrayList;

public interface IHolodilnik {
    /**
     * Вывести список продуктов в холодильнике в алфавитном порядке
     * Пример: Груша - 5
     * @return
     */
    ArrayList getProductsInOrder();
    /**
     * Вывести наименование продукта в холодильнике с максимальным количеством
     */
    void productWithMaxAmount();
    /**
     * Вывести наименование продукта в холодильнике с минимальным количеством
     */
    void productWithMinAmount();
    /**
     * Вывести количество выбранного продукта
     * @param s Наименование продукта
     */
    void productAmount(String s);
    /**
     * Вывести список и количество продуктов, которых осталось
     * меньше, чем n
     * @param n значение, до которого выводятся продукты
     */
    void getMinSet(int n);
}
