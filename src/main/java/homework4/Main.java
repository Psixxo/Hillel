package main.java.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of income: ");
        double inc = scanner.nextDouble();
        double tax;

        if(inc <= 10000) {
            tax = 2.5 / 100;

        } else if (inc <= 25000) {
            tax = 4.3 / 100;
        } else {
            tax = 6.7 / 100;
        }
        double total = inc * tax;
        System.out.printf("The amount of tax on income is %.2f UAH: %.2f UAH%n", inc, total);
    }
}
