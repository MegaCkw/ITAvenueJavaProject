package lesson3;

public class Main9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 5 == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
