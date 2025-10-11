package main.java.lesson7;

public class App {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int firstteam = a[0];
        System.out.println("first item is: " + firstteam);

        a[0] = 42;
        System.out.println("first item is: " + firstteam);
    }
}
