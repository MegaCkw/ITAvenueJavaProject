package homework.lesson3;

public class Homework7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println("Наименьшее общее кратное 4 и 7 это " + i);
                break;
            }
        }

    }
}
