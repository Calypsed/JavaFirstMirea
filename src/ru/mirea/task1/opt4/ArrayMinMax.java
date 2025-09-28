package ru.mirea.task1.opt4;
import java.util.Scanner;

public class ArrayMinMax {
    /*
    Написать программу, в результате которой массив чисел вводится
    пользователем с клавиатуры считается сумма элементов целочисленного
    массива с помощью циклов do while, while, также необходимо найти
    максимальный и минимальный элемент в массиве, результат выводится на экран.
     */

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int n = n1;
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int minVal = 0;
        boolean isMinCalibrating = true;
        int maxVal = 0;
        do {
            System.out.print("Введите " + Integer.toString(i + 1) + "-е число: ");
            arr[i] = sc.nextInt();

            if (isMinCalibrating){
                minVal = arr[i];
                isMinCalibrating = false;
            } else {
                if(arr[i] < minVal){
                    minVal = arr[i];
                }
            }
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

            sum += arr[i];
            i++;
        } while (i < n);
        System.out.print("Сумма массива из " + Integer.toString(n) + " элементов: " + Integer.toString(sum) + "\n");
        System.out.print("Минимальное число: " + Integer.toString(minVal) + ", " + "Максимальное число: " + Integer.toString(maxVal) + '\n');

        i = 0;
        maxVal = 0;
        isMinCalibrating = true;
        n = n2;
        arr = new int[n];
        while (i < n) {
            System.out.print("Введите " + Integer.toString(i + 1) + "-е число: ");
            arr[i] = sc.nextInt();

            if (isMinCalibrating){
                minVal = arr[i];
                isMinCalibrating = false;
            } else {
                if(arr[i] < minVal){
                    minVal = arr[i];
                }
            }
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

            sum += arr[i];
            i++;
        }
        System.out.print("Сумма массива из " + Integer.toString(n) + " элементов: " + Integer.toString(sum) + "\n");
        System.out.print("Минимальное число: " + Integer.toString(minVal) + ", " + "Максимальное число: " + Integer.toString(maxVal) + '\n');
    }
}

