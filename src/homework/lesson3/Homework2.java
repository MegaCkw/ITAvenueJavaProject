package homework.lesson3;

public class Homework2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 4, 6, 4, 6, 7, 5, 6, 7};

        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}