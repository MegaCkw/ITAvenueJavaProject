package homework.lesson6;

public class test1 {
    public static void main(String[] args) {
        String str1 = "yrnfkfjoudgllahIjswkhJXKSE!";
        String str2 = new StringBuffer(str1).reverse().toString();

        for (int i = 0; i < str2.length(); i++) {
            char currentChar = str2.charAt(i);
            if (currentChar == 'A' || currentChar == 'a' || currentChar == 'e' || currentChar == 'E' || currentChar == 'Y' || currentChar == 'y' || currentChar == 'U' || currentChar == 'u' || currentChar == 'I' || currentChar == 'i' || currentChar == 'O' || currentChar == 'o') {
                System.out.println(str2.charAt(i));

            }
        }

    }
}
