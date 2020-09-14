package lesson6;

public class Main {
    public static void main(String[] args) {
        int[][] symbols = new int[5][5];

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                if (i == j) {
                    System.out.print(symbols[i][j] + " ");
                } else {
                    System.out.println("" + "");
                }
            }
            System.out.println();
        }

    }


}

