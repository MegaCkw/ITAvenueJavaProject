package lesson12;

import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add ("rytrg");
        strings.add ("rrrrrr");
        strings.add ("ryyyyyyy ");



        //1 способ проход по коллекции цикл for не подойдет к сетам
        for (int i = 0; i< strings.size();i++){
            System.out.println(strings.get(i));
        }
        //2 способ проход по коллекции цикл foreach

        for (String s:strings){
            System.out.println(s);
        }

        //3 способ проход по коллекции с помощью итератора
        for (Iterator<String> iterator = strings.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }



    }



}
