package lesson10;

public class Main1 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);

        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns());
        System.out.println(matrix.getValueAt(0, 1));

        matrix.setValueAt(0, 0, 3);
        matrix.setValueAt(0, 1, 8);
        matrix.setValueAt(0, 2, 5);

        matrix.setValueAt(1, 0, 9);
        matrix.setValueAt(1, 1, 6);
        matrix.setValueAt(1, 2, 8);

        System.out.println(matrix.getValueAt(1, 2));
        matrix.fillMatrix(7);
        System.out.println(matrix.isSquareMatrix());
        matrix.printToConsole();
        System.out.println(matrix.isNullMatrix());






    }
}




