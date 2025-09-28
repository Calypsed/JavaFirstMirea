package ru.mirea.task1.opt3;
import java.util.Scanner;

public class ArraySum {
    /*
    Написать программу, в результате которой массив чисел создается с
    помощью инициализации (как в Си) вводится и считается в цикле сумма
    элементов целочисленного массива, а также среднее арифметическое его
    элементов результат выводится на экран. Использовать цикл for
     */

    public static void main(String[] args) {
        int n = 3;
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + Integer.toString(i + 1) + "-е число: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Сумма массива из " + Integer.toString(n) + " элементов: " + Integer.toString(sum) + "\n");
        System.out.print("Среднее арифметическое: " + Integer.toString(sum) + " / " + Integer.toString(n) + " = " + Integer.toString(sum / n));
    }
}


