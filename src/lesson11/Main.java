package lesson11;

import lesson10.IMatrix;
import lesson10.Matrix;

public class Main {
    public static void main(String[] args) {
        double[][] num1 = {{4, 10, 3, 7},
                           {2, 4, 6, 8},
                           {5, 6, 3, 9}};
        Matrix matrix1 = new Matrix(num1);


        double[][] num2 = {{7, 4, 7, 0},
                           {2, 3, 6, 6},
                           {5, 9, 8, 4}};
        Matrix matrix2 = new Matrix(num2);


       IMatrix resultAdd = matrix1.add(matrix2);
       resultAdd.printToConsole();

        }


    }


