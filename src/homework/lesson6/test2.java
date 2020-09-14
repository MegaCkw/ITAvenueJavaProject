package homework.lesson6;

public class test2 {
    public static void main(String[] args) {
        String str1 = ("I like programming");
        String str2 = str1.toUpperCase();

        for (int i = 0; i < str2.length(); i++) {
            char currentChar = str2.charAt(i);
            if (currentChar == 'A' || currentChar == 'E' || currentChar == 'Y' || currentChar == 'U' || currentChar == 'I' || currentChar == 'O') {
                System.out.println(str2.charAt(i));

            }

        }


    }
}
