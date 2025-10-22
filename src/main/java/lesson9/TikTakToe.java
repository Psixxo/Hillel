package main.java.lesson9;

import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        String[][] battleField = new String[3][3];
        int step = 1;

        var symbolX = "X";
        var symbolO = "O";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (String[] row : battleField) {
                for (String column : row) {
                    var elementTopPrint = column == null ? "" : column;
                    System.out.print("[ " + elementTopPrint + " ]");

                }
                System.out.println();
            }

            boolean evenStep = step % 2 == 0;
            String currentPlayer = evenStep? "Second player" : "First player";
            System.out.println(currentPlayer + "Enter location of your symbol");
            int locationA = scanner.nextInt();
            int locationB = scanner.nextInt();
            String currentSymbol = evenStep? symbolO : symbolX;

            String elementByLocation = battleField[locationA][locationB];
            if (elementByLocation != null) {
                System.out.println("This location is occupied by " + "\"" + elementByLocation + "\"" + ". Tre one more time!");
                continue;
            }
            battleField[locationA][locationB] = currentSymbol;
            step++;
            outer:
            for (String[] rows : battleField) {
                String firstElement = rows[0];
                String prevElement = rows[0];
                for (int i = 1; i < rows.length ; i++) {
                    String currentElement = rows[i];
                    if (firstElement == null || currentElement == null) {
                        continue outer;
                    }
                    if (currentElement.equals(prevElement) && i == 2) {
                        System.out.println(currentPlayer + "wins!");
                        return;

                    }
                    
                }

            }



        }


    }
}
