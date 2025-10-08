package main.java.lesson5;

public class App {
public static void main(String[] args) {
    int sumchisel = 0;
    for (int i = 1; i <= 6; i++) {
        sumchisel += i;
        System.out.printf("%d) Num is %d, sum is %d%n", i, i, sumchisel);
    }
    System.out.println("---------------------------");
    System.out.printf("Sum of numbers is %d",sumchisel);
}
}
