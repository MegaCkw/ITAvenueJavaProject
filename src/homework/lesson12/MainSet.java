package homework.lesson12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.SortedSet;

public class MainSet {

    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(5);
        integers.add(5);
        integers.add(6);
        integers.add(8);


        HashSet<String> strings = new HashSet<>();
        strings.add("aaaa");
        strings.add("gggg");
        strings.add("kkkk");
        strings.add("pppp");

        SetUtilsImpl setUtils = new SetUtilsImpl();
        SortedSet<String> result = setUtils.orderedSet(integers, strings);
        System.out.println(result);







    }
}
