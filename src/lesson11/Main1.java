package lesson11;

import lesson10.IMatrix;
import lesson10.Matrix;

public class Main1 {
    public static void main(String[] args) {
        double [][] num3 = {{5,6,7},
                            {7,8,9},
                            {7,9,2}};
        Matrix matrix3 = new Matrix(num3);

        double [][] num4 = {{7,8,1},
                            {6,8,7},
                            {0,2,2}};
        Matrix matrix4 = new Matrix(num4);

        IMatrix resultSub = matrix3.sub(matrix4);
        resultSub.printToConsole();

        IMatrix resultMul1 = matrix3.mul(matrix4);
        resultMul1.printToConsole();














    }
}
