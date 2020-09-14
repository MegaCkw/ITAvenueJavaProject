package homework.lesson6;

public class test4 {
    public static void main(String[] args) {
        String str1 = "I like programming";

        for (int i = 0; i < str1.length(); i++) {
            char currentSymbol = str1.charAt(i);

            System.out.print((char) (currentSymbol + 1));
        }
    }
}
