package lesson6;

public class Main1 {
    public static void main(String[] args) {
        char[] firstArray = {'q', 'w', 'e', 'r'};
        char[] secArray = {'b', 'c', 'd', 'f'};
        char[] bigArray = new char[firstArray.length + secArray.length];
        for (int i = 0; i < bigArray.length; i++) {
            if (i < firstArray.length) {
                bigArray[i] = firstArray[i];
            } else {
                bigArray[i] = secArray[i - firstArray.length];
            }

        }
        System.out.println(bigArray);

    }
}
