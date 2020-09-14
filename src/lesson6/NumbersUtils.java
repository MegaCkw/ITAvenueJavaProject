package lesson6;

public class NumbersUtils {

    // 1 - модификатор доступа (одно из 4х слов:
    // public - доступ во всем проекте
    //        - доступ внутри данного пакета
    // protected - только наследникам
    // private - внутри текущего класса
    // Модифиатор доступа указываетя в 4х местах: 1 - перед классом, 2 - перед методом, 3- перед полем класса

    // 2 - static (может быть или не быть)/определяет принадлежность. Этот мето может принадлежать какому-то объ
    // екту или всем общедоступен.
    // 3 - abstract (может быть или не быть)
    // 4 - возвращаемый тип  (или void отсутствует возвращаемый тип)
    // 5 - максимально удобное название метода
    // 6 - входящие параметры в метод (в скобках через запятую тип название, тип название, и тд)
    // 7 - тело, то что будет выполнятся при вызове данного метода
    public static int min(int a, int b) {


        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void printWordsSomeTimes(String words, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(words);
        }
    }
}
