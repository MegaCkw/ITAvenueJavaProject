package lesson15;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        try {
            people.setAge(-200);
            System.out.println("все хорошо");
        } catch (UncurrentAgeExeption e) {
            e.printStackTrace();
            System.out.println("Не тот возраст");
        }
        System.out.println("Программа дальше работает");


    }

}
