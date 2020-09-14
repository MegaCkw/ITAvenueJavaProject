package homework.lesson12;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {


        return null;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        Collections.sort(data);
        Collections.reverse(data);
        return data;
    }
}
