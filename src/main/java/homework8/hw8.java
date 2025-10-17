package main.java.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];
            int temp2 = i - 1;

        while (temp2 >= 0 && array[temp2] > temp) {

            array[temp2+1] = array[temp2];
            temp2--;
        }
          array[temp2+1] = temp;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        int left = 0;
        int right = array.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                index = mid;
                break;
            }
            else if (array[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if (index != -1){
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        }
        else {
            System.out.println("Число " + target + " не знайдено в масиві.");
        }
        scanner.close();
    }
}
