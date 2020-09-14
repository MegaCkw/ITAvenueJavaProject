package homework.lesson3;

public class Homework4 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 4, 6, 4, 6, 7, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sum += numbers[i];

            }
        }
        System.out.println("Сумма нечетных элементов массива: " + sum);
    }
}
