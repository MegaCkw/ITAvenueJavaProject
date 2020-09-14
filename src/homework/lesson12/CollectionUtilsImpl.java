package homework.lesson12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public java.util.Collection<Integer> union(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public java.util.Collection<Integer> intersection(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result2 = new ArrayList<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result2.add(i);
            }

        }
        return result2;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        Set<Integer> result3 = new HashSet<>();
        result3.addAll(a);
        result3.addAll(b);

        return result3;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {

        Set<Integer> result4 = new HashSet<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result4.add(i);
            }

        }
        return result4;


    }

    @Override
    public java.util.Collection<Integer> difference(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result5 = new ArrayList<>();

        for (Integer i: b){
            if (!a.contains(i)){
                result5.add(i);
            }
        }
        for (Integer j: a){
            if (!b.contains(j)){
                result5.add(j);
            }
        }

        return result5;
    }
}
