package main.java.homework9;

import java.util.Random;

public class Hw9 {

    public static void main(String[] args) {

       /* int[][] matrix = {
                {23, 45, 12, 37},
                {50, 11, 42, 20},
                {33, 27, 19, 48},
                {8, 39, 6, 4}
        }; */

        /* int[][] matrix = {
                {12, 33, 5, 11},
                {44, 2, 13, 7},
                {31, 14, 11, 39},
                {47, 28, 15, 1}
        }; */

        Random random = new Random();
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Матриця 4x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sumEvenRows = 0;
        int sumOddRows = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (i % 2 == 0) {
                sumEvenRows += rowSum;
            } else {
                sumOddRows += rowSum;
            }
        }

        long prodEvenCols = 1;
        long prodOddCols = 1;

        for (int j = 0; j < matrix[0].length; j++) {
            long colProduct = 1;
            for (int i = 0; i < matrix.length; i++) {
                colProduct *= matrix[i][j];
            }
            if (j % 2 == 0) {
                prodEvenCols *= colProduct;
            } else {
                prodOddCols *= colProduct;
            }
        }

        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prodEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prodOddCols);
        System.out.println();

        boolean isMagic = true;
        int magicSum = 0;

        for (int j = 0; j < matrix.length; j++) {
            magicSum += matrix[0][j];
        }

        for (int i = 1; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        for (int j = 0; j < matrix.length && isMagic; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][matrix.length - 1 - i];
        }
        if (diag1 != magicSum || diag2 != magicSum) {
            isMagic = false;
        }

        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        }
        else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}
