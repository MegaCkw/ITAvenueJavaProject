package homework.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public interface SetUtils {

    ArrayList<String> colection1 = new ArrayList<>();

    /**
     * Возвращает отсортированное множество в обратном порядке (по убыванию) как объединение двух коллекций
     * collection1 - коллекция чисел (Нужно привести каждое число к строковому представлению) и set2 - множество
     * неотсортированных строк
     *
     * @param //colection1 коллекция чисел
     * @param set2       множество неотсортированных строк
     * @return отсортированное множество в обратном порядке
     * @throws NullPointerException если collection1 или set2 == null
     */
    SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException;

    /**
     * Возвращает множество чисел val1,val2,val3,val4,val5 в таком же порядке
     *
     * @param val1 аргумент функции
     * @param val2 аргумент функции
     * @param val3 аргумент функции
     * @param val4 аргумент функции
     * @param val5 аргумент функции
     * @return упорядоченное множество в заданном порядке
     */
    Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5);
}


