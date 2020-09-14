package lesson2;

public class Main2 {

    public static void main(String[] args) {
        int a = 555;
        int b = 5;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        }
        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        }
        if  ((a == c && c != b) || (b == c && c != a) || (a == b && b != c)) {

            System.out.println("Это равнобедренный треугольник");
            }
        }
    }
