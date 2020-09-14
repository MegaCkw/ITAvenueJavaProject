package homework.lesson3;

public class Homework1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 4, 6, 4, 6, 7, 5, 6, 7};

        System.out.println("Элементы массива через один: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(numbers[i]);
            }

        }
    }
}
