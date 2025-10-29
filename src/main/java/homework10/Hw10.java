package main.java.homework10;

import java.util.Arrays;
import java.util.Scanner;

public class Hw10 {

    public static void printSquare(int num) {
        System.out.println("Квадрат числа " + num + " дорівнює " + (num * num) + ".");
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int num = Integer.parseInt(scanner.nextLine());
        printSquare(num);
        System.out.println();

        System.out.print("2. Введіть радіус: ");
        double r = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double h = scanner.nextDouble();
        double volume = cylinderVolume(r, h);
        scanner.nextLine();
        System.out.println("Об'єм циліндра з радіусом " + r + " і висотою " + h +
                " дорівнює " + volume + ".");
        System.out.println();

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("3. Масив чисел: " + Arrays.toString(arr));
        System.out.println("Сума всіх елементів масиву дорівнює " + arraySum(arr) + ".");
        System.out.println();

        System.out.print("4. Введіть рядок: ");
        String text = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverseString(text));
        System.out.println();

        System.out.print("5. Введіть a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введіть b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Результат " + a + "^" + b + " дорівнює " + pow(a, b) + ".");
        System.out.println();

        System.out.print("6. Введіть ціле число n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Введіть текстовий рядок: ");
        String txt = scanner.nextLine();
        printTextNTimes(n, txt);
    }
}
