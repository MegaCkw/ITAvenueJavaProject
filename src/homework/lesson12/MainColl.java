package homework.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class MainColl {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(6);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);

        CollectionUtilsImpl utilsImpl = new CollectionUtilsImpl();
        Collection<Integer> union = utilsImpl.union(a, b);
        System.out.println("Объединение c дубликатами " + union);

        CollectionUtilsImpl utilsImpl2 = new CollectionUtilsImpl();
        Collection<Integer> intersection = utilsImpl2.intersection(a,b);
        System.out.println("Пересечение с дубликатами: " + intersection);

        CollectionUtilsImpl utilsImpl3 = new CollectionUtilsImpl();
        Collection<Integer> unionWithoutDuplicates = utilsImpl3.unionWithoutDuplicate(a,b);
        System.out.println("Объединение без дубликатов " + unionWithoutDuplicates);

        CollectionUtilsImpl utilsImpl4 = new CollectionUtilsImpl();
        Collection<Integer> intersectionWithoutDuplicate = utilsImpl4.intersectionWithoutDuplicate(a,b);
        System.out.println("Пересечение без дубликатов " + intersectionWithoutDuplicate);
//
//        CollectionUtilsImpl utilsImpl5 = new CollectionUtilsImpl();
//        Collection<Integer> difference = utilsImpl5.difference(a,b);
//        System.out.println("Разность двух коллекций " + difference);













    }
}
