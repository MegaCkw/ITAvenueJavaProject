package homework.lesson3;

public class Homework5 {
    public static void main(String[] args) {
        int[] numbers = {15, 40, 6, 78, 50};
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Максимальное число массива: " + max);
    }
}
