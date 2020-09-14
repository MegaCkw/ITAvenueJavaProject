package lesson5;

public class Main1 {
    public static void main(String[] args) {
        String password = "ygogoyg";

        for (int i = 0; i < password.length(); i++) {

            char currentChar = password.charAt(i);
            if (currentChar == '1' || currentChar == '2' || currentChar == '3' || currentChar == '4' || currentChar == '5' || currentChar == '6' || currentChar == '7' || currentChar == '8' || currentChar == '9' || currentChar == '0') {
                System.out.println("Пароль подходт!");
                return;
            }
        }
        System.out.println("В пароле нет цифр!");



    }
}
