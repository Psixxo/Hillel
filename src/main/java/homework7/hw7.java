package main.java.homework7;

import java.util.Arrays;

public class hw7 {
    public static void main(String[] args) {
        int[] array = new int[] {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        System.out.println("Елементи масиву: " + Arrays.toString(array));
        int sumneg = 0;
        for (int num : array) {
            if (num < 0) sumneg += num;
        }
        System.out.println("Сума від'ємних чисел: " + sumneg);
        int parcount = 0;
        int neparcount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                parcount++;
            }
            else{
                neparcount++;
            }
        }
        System.out.println("Кількість парних чисел: " + parcount);
        System.out.println("Кількість непарних чисел: " + neparcount);
        int min = 0;
        int max = 0;
        int minindex = 0;
        int maxindex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minindex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxindex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minindex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxindex + ")");
        int firstnegindex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstnegindex = i;
            }
        }
        if (firstnegindex == -1) {
            System.out.println("У масиві немає від'ємних чисел.");
        }
        else {
            double sum = 0;
            int count = 0;
            boolean flagneg = false;
            for (int num : array) {
                if (flagneg) {
                    sum += num;
                    count++;
                }
                if (num < 0){
                    flagneg = true;
                }
            }
            double average = sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f", average);
        }
    }
}
