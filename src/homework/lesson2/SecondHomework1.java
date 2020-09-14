package homework.lesson2;

public class SecondHomework1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 5;
        int d = 12;

        if (a == b && a == c && a == d) {
            System.out.printf("Это четырехугольник, параллелограмм. Возможно, ромб или квадрат.");
        }
        else if (a == b && a != c && a != d && c == d ||
                a == c && a != b && a != d && b == d ||
                a == d && a != b && a != c && b == c) {
            System.out.println("Это прямоугольник.");
        }
        else {
            System.out.printf("Это другая фигура.");
        }
    }
}
