package lesson10;


public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }

    public Matrix() {
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getColumns()) {
            System.out.println("Задан неподходящий индекс строки!");
            return 0.0;
        }
        if (colIndex >= this.getColumns()) {
            System.out.println("Задан неподходящий индекс колонки!");
            return 0.0;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getColumns()) {
            System.out.println("Задан неподходящий индекс строки!");
            return;
        }
        if (colIndex >= this.getColumns()) {
            System.out.println("Задан неподходящий индекс колонки!");
            return;
        }
        numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не подходит количество строк!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не подходит количество колонок!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не подходит");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не подходит");
            return null;
        }
        Matrix result2 = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result2.getRows(); i++) {
            for (int j = 0; j < result2.getColumns(); j++) {
                result2.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result2;

    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

//    @Override
//    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//        if (this.getColumns() != otherMatrix.getRows()) {
//            System.out.println("Количество столбцов первой матрицы не равно количеству строк второй матрицы!");
//            return null;
//
//            Matrix result3 = new Matrix(this.getRows(),otherMatrix.getColumns());
//            for (int i = 0; i < this.getRows(); i++) {
//                for (int j = 0; j < otherMatrix.getColumns(); j++) {
//                    for (int k = 0; k < otherMatrix.getRows(); k++){
//                        result3.setValueAt();
//                    }
//                }
//
//            }
//        }
//
//        return result3;
//    }
//
//    @Override
//    public IMatrix mul2(double value) {
//        return null;
//    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = value;
            }

        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        } else
            return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(" " + numbers[i][j] + " ");
                System.out.print(" ");
            }
        }

    }
}
