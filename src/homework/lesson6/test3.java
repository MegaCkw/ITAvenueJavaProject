package homework.lesson6;

public class test3 {
    public static void main(String[] args) {
        String password = "Run45Qwerty";
        String numbers = "0123456789";
        String letters = password.toLowerCase();

        if (password.length() > 7) {
            System.out.println("Пароль больше семи символов");
        } else System.out.println("Пароль меньше семи символов!");


        if (password == letters) {
            System.out.println("В пароле нет заглавной буквы!");
        } else System.out.println("В пароле есть заглавная буква");


        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            int indexNumber = numbers.indexOf(currentChar);
            if (indexNumber >= 0) {
                System.out.println("Пароль содержит цифру");
                return;
            }
        }
        System.out.println("В пароле нет цифры!");


    }
}
