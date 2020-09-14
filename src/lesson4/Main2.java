package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String emailFromUser = "dsffgg@ftgf.gff";

        if (emailFromUser == null) {
            System.out.println("Вы не ввели почту!");
        }
        int indexOfAt = emailFromUser.indexOf("@");
        if (indexOfAt == -1) {
            System.out.println("Это не почта! Нет собачки!");
            return;
        }

        String[] textBeforeAndAfterAt = emailFromUser.split("@");
        if (textBeforeAndAfterAt[0].length() < 1) {
            System.out.println("Это не почта. До собачки меньше пяти символов.");
            return;
        }
        int dotAfterAt = textBeforeAndAfterAt[1].indexOf(".");
        if (dotAfterAt == -1) {
            System.out.println("Это не почта! Нет точки!");
            return;
        }
        System.out.println("Почта нам подходит!");
    }
}
